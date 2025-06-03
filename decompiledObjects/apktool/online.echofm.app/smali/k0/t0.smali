.class public final Lk0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lx0/v$a;
.implements LA0/D$a;
.implements Lk0/T0$d;
.implements Lk0/s$a;
.implements Lk0/V0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/t0$f;,
        Lk0/t0$e;,
        Lk0/t0$h;,
        Lk0/t0$b;,
        Lk0/t0$c;,
        Lk0/t0$d;,
        Lk0/t0$g;
    }
.end annotation


# static fields
.field public static final l0:J


# instance fields
.field public final A:J

.field public final B:Z

.field public final C:Lk0/s;

.field public final D:Ljava/util/ArrayList;

.field public final E:Lg0/c;

.field public final F:Lk0/t0$f;

.field public final G:Lk0/E0;

.field public final H:Lk0/T0;

.field public final I:Lk0/w0;

.field public final J:J

.field public final K:Ll0/y1;

.field public final L:Z

.field public M:Lk0/d1;

.field public N:Lk0/U0;

.field public O:Lk0/t0$e;

.field public P:Z

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:J

.field public U:Z

.field public V:I

.field public W:Z

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public a0:I

.field public b0:Lk0/t0$h;

.field public c0:J

.field public d0:J

.field public e0:I

.field public f0:Z

.field public g0:Lk0/u;

.field public h0:J

.field public i0:J

.field public j0:Lk0/w$c;

.field public k0:Ld0/I;

.field public final o:[Lk0/Y0;

.field public final p:Ljava/util/Set;

.field public final q:[Lk0/a1;

.field public final r:LA0/D;

.field public final s:LA0/E;

.field public final t:Lk0/x0;

.field public final u:LB0/e;

.field public final v:Lg0/k;

.field public final w:Landroid/os/HandlerThread;

.field public final x:Landroid/os/Looper;

.field public final y:Ld0/I$c;

.field public final z:Ld0/I$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-static {v0, v1}, Lg0/M;->i1(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lk0/t0;->l0:J

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>([Lk0/Y0;LA0/D;LA0/E;Lk0/x0;LB0/e;IZLl0/a;Lk0/d1;Lk0/w0;JZZLandroid/os/Looper;Lg0/c;Lk0/t0$f;Ll0/y1;Landroid/os/Looper;Lk0/w$c;)V
    .locals 14

    .line 1
    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p8

    move-wide/from16 v6, p11

    move-object/from16 v8, p16

    move-object/from16 v9, p18

    move-object/from16 v10, p19

    move-object/from16 v11, p20

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v12, p17

    iput-object v12, v0, Lk0/t0;->F:Lk0/t0$f;

    iput-object v1, v0, Lk0/t0;->o:[Lk0/Y0;

    iput-object v2, v0, Lk0/t0;->r:LA0/D;

    move-object/from16 v12, p3

    iput-object v12, v0, Lk0/t0;->s:LA0/E;

    iput-object v3, v0, Lk0/t0;->t:Lk0/x0;

    iput-object v4, v0, Lk0/t0;->u:LB0/e;

    move/from16 v13, p6

    iput v13, v0, Lk0/t0;->V:I

    move/from16 v13, p7

    iput-boolean v13, v0, Lk0/t0;->W:Z

    move-object/from16 v13, p9

    iput-object v13, v0, Lk0/t0;->M:Lk0/d1;

    move-object/from16 v13, p10

    iput-object v13, v0, Lk0/t0;->I:Lk0/w0;

    iput-wide v6, v0, Lk0/t0;->J:J

    iput-wide v6, v0, Lk0/t0;->h0:J

    move/from16 v6, p13

    iput-boolean v6, v0, Lk0/t0;->Q:Z

    move/from16 v6, p14

    iput-boolean v6, v0, Lk0/t0;->L:Z

    iput-object v8, v0, Lk0/t0;->E:Lg0/c;

    iput-object v9, v0, Lk0/t0;->K:Ll0/y1;

    iput-object v11, v0, Lk0/t0;->j0:Lk0/w$c;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v6, v0, Lk0/t0;->i0:J

    iput-wide v6, v0, Lk0/t0;->T:J

    invoke-interface {v3, v9}, Lk0/x0;->h(Ll0/y1;)J

    move-result-wide v6

    iput-wide v6, v0, Lk0/t0;->A:J

    invoke-interface {v3, v9}, Lk0/x0;->f(Ll0/y1;)Z

    move-result v3

    iput-boolean v3, v0, Lk0/t0;->B:Z

    sget-object v3, Ld0/I;->a:Ld0/I;

    iput-object v3, v0, Lk0/t0;->k0:Ld0/I;

    invoke-static/range {p3 .. p3}, Lk0/U0;->k(LA0/E;)Lk0/U0;

    move-result-object v3

    iput-object v3, v0, Lk0/t0;->N:Lk0/U0;

    new-instance v6, Lk0/t0$e;

    invoke-direct {v6, v3}, Lk0/t0$e;-><init>(Lk0/U0;)V

    iput-object v6, v0, Lk0/t0;->O:Lk0/t0$e;

    array-length v3, v1

    new-array v3, v3, [Lk0/a1;

    iput-object v3, v0, Lk0/t0;->q:[Lk0/a1;

    invoke-virtual/range {p2 .. p2}, LA0/D;->d()Lk0/a1$a;

    move-result-object v3

    const/4 v6, 0x0

    :goto_0
    array-length v7, v1

    if-ge v6, v7, :cond_1

    aget-object v7, v1, v6

    invoke-interface {v7, v6, v9, v8}, Lk0/Y0;->D(ILl0/y1;Lg0/c;)V

    iget-object v7, v0, Lk0/t0;->q:[Lk0/a1;

    aget-object v12, v1, v6

    invoke-interface {v12}, Lk0/Y0;->G()Lk0/a1;

    move-result-object v12

    aput-object v12, v7, v6

    if-eqz v3, :cond_0

    iget-object v7, v0, Lk0/t0;->q:[Lk0/a1;

    aget-object v7, v7, v6

    invoke-interface {v7, v3}, Lk0/a1;->x(Lk0/a1$a;)V

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Lk0/s;

    invoke-direct {v1, p0, v8}, Lk0/s;-><init>(Lk0/s$a;Lg0/c;)V

    iput-object v1, v0, Lk0/t0;->C:Lk0/s;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lk0/t0;->D:Ljava/util/ArrayList;

    invoke-static {}, LX2/a0;->h()Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lk0/t0;->p:Ljava/util/Set;

    new-instance v1, Ld0/I$c;

    invoke-direct {v1}, Ld0/I$c;-><init>()V

    iput-object v1, v0, Lk0/t0;->y:Ld0/I$c;

    new-instance v1, Ld0/I$b;

    invoke-direct {v1}, Ld0/I$b;-><init>()V

    iput-object v1, v0, Lk0/t0;->z:Ld0/I$b;

    invoke-virtual {v2, p0, v4}, LA0/D;->e(LA0/D$a;LB0/e;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lk0/t0;->f0:Z

    const/4 v1, 0x0

    move-object/from16 v2, p15

    invoke-interface {v8, v2, v1}, Lg0/c;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lg0/k;

    move-result-object v2

    new-instance v3, Lk0/E0;

    new-instance v4, Lk0/s0;

    invoke-direct {v4, p0}, Lk0/s0;-><init>(Lk0/t0;)V

    invoke-direct {v3, v5, v2, v4, v11}, Lk0/E0;-><init>(Ll0/a;Lg0/k;Lk0/B0$a;Lk0/w$c;)V

    iput-object v3, v0, Lk0/t0;->G:Lk0/E0;

    new-instance v3, Lk0/T0;

    invoke-direct {v3, p0, v5, v2, v9}, Lk0/T0;-><init>(Lk0/T0$d;Ll0/a;Lg0/k;Ll0/y1;)V

    iput-object v3, v0, Lk0/t0;->H:Lk0/T0;

    if-eqz v10, :cond_2

    iput-object v1, v0, Lk0/t0;->w:Landroid/os/HandlerThread;

    iput-object v10, v0, Lk0/t0;->x:Landroid/os/Looper;

    goto :goto_1

    :cond_2
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "ExoPlayer:Playback"

    const/16 v3, -0x10

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Lk0/t0;->w:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, v0, Lk0/t0;->x:Landroid/os/Looper;

    :goto_1
    iget-object v1, v0, Lk0/t0;->x:Landroid/os/Looper;

    invoke-interface {v8, v1, p0}, Lg0/c;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lg0/k;

    move-result-object v1

    iput-object v1, v0, Lk0/t0;->v:Lg0/k;

    return-void
.end method

.method public static D0(Ld0/I;Lk0/t0$d;Ld0/I$c;Ld0/I$b;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lk0/t0$d;->r:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p3}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Ld0/I$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0, v0, p2}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget p2, p2, Ld0/I$c;->o:I

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, p2, p3, v0}, Ld0/I;->g(ILd0/I$b;Z)Ld0/I$b;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, Ld0/I$b;->b:Ljava/lang/Object;

    .line 21
    .line 22
    iget-wide v0, p3, Ld0/I$b;->d:J

    .line 23
    .line 24
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long p3, v0, v2

    .line 30
    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    const-wide/16 v2, 0x1

    .line 34
    .line 35
    sub-long/2addr v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p1, p2, v0, v1, p0}, Lk0/t0$d;->e(IJLjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static E(LA0/y;)[Ld0/q;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-interface {p0}, LA0/B;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    new-array v2, v1, [Ld0/q;

    .line 11
    .line 12
    :goto_1
    if-ge v0, v1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, v0}, LA0/B;->b(I)Ld0/q;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    aput-object v3, v2, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    return-object v2
.end method

.method public static E0(Lk0/t0$d;Ld0/I;Ld0/I;IZLd0/I$c;Ld0/I$b;)Z
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v8, p1

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v9, p5

    .line 7
    .line 8
    move-object/from16 v10, p6

    .line 9
    .line 10
    iget-object v2, v0, Lk0/t0$d;->r:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v11, 0x0

    .line 13
    const/4 v12, 0x1

    .line 14
    const-wide/high16 v13, -0x8000000000000000L

    .line 15
    .line 16
    if-nez v2, :cond_3

    .line 17
    .line 18
    iget-object v1, v0, Lk0/t0$d;->o:Lk0/V0;

    .line 19
    .line 20
    invoke-virtual {v1}, Lk0/V0;->f()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    cmp-long v1, v1, v13

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v1, v0, Lk0/t0$d;->o:Lk0/V0;

    .line 35
    .line 36
    invoke-virtual {v1}, Lk0/V0;->f()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    invoke-static {v1, v2}, Lg0/M;->J0(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    :goto_0
    new-instance v3, Lk0/t0$h;

    .line 45
    .line 46
    iget-object v4, v0, Lk0/t0$d;->o:Lk0/V0;

    .line 47
    .line 48
    invoke-virtual {v4}, Lk0/V0;->h()Ld0/I;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iget-object v5, v0, Lk0/t0$d;->o:Lk0/V0;

    .line 53
    .line 54
    invoke-virtual {v5}, Lk0/V0;->d()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-direct {v3, v4, v5, v1, v2}, Lk0/t0$h;-><init>(Ld0/I;IJ)V

    .line 59
    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    move-object/from16 v1, p1

    .line 63
    .line 64
    move-object v2, v3

    .line 65
    move v3, v4

    .line 66
    move/from16 v4, p3

    .line 67
    .line 68
    move/from16 v5, p4

    .line 69
    .line 70
    move-object/from16 v6, p5

    .line 71
    .line 72
    move-object/from16 v7, p6

    .line 73
    .line 74
    invoke-static/range {v1 .. v7}, Lk0/t0;->H0(Ld0/I;Lk0/t0$h;ZIZLd0/I$c;Ld0/I$b;)Landroid/util/Pair;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-nez v1, :cond_1

    .line 79
    .line 80
    return v11

    .line 81
    :cond_1
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-virtual {v8, v2}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, Ljava/lang/Long;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide v3

    .line 95
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-virtual {p0, v2, v3, v4, v1}, Lk0/t0$d;->e(IJLjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v0, Lk0/t0$d;->o:Lk0/V0;

    .line 101
    .line 102
    invoke-virtual {v1}, Lk0/V0;->f()J

    .line 103
    .line 104
    .line 105
    move-result-wide v1

    .line 106
    cmp-long v1, v1, v13

    .line 107
    .line 108
    if-nez v1, :cond_2

    .line 109
    .line 110
    invoke-static {v8, p0, v9, v10}, Lk0/t0;->D0(Ld0/I;Lk0/t0$d;Ld0/I$c;Ld0/I$b;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    return v12

    .line 114
    :cond_3
    invoke-virtual {v8, v2}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    const/4 v3, -0x1

    .line 119
    if-ne v2, v3, :cond_4

    .line 120
    .line 121
    return v11

    .line 122
    :cond_4
    iget-object v3, v0, Lk0/t0$d;->o:Lk0/V0;

    .line 123
    .line 124
    invoke-virtual {v3}, Lk0/V0;->f()J

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    cmp-long v3, v3, v13

    .line 129
    .line 130
    if-nez v3, :cond_5

    .line 131
    .line 132
    invoke-static {v8, p0, v9, v10}, Lk0/t0;->D0(Ld0/I;Lk0/t0$d;Ld0/I$c;Ld0/I$b;)V

    .line 133
    .line 134
    .line 135
    return v12

    .line 136
    :cond_5
    iput v2, v0, Lk0/t0$d;->p:I

    .line 137
    .line 138
    iget-object v2, v0, Lk0/t0$d;->r:Ljava/lang/Object;

    .line 139
    .line 140
    invoke-virtual {v1, v2, v10}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 141
    .line 142
    .line 143
    iget-boolean v2, v10, Ld0/I$b;->f:Z

    .line 144
    .line 145
    if-eqz v2, :cond_6

    .line 146
    .line 147
    iget v2, v10, Ld0/I$b;->c:I

    .line 148
    .line 149
    invoke-virtual {v1, v2, v9}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget v2, v2, Ld0/I$c;->n:I

    .line 154
    .line 155
    iget-object v3, v0, Lk0/t0$d;->r:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-virtual {v1, v3}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-ne v2, v1, :cond_6

    .line 162
    .line 163
    iget-wide v1, v0, Lk0/t0$d;->q:J

    .line 164
    .line 165
    invoke-virtual/range {p6 .. p6}, Ld0/I$b;->n()J

    .line 166
    .line 167
    .line 168
    move-result-wide v3

    .line 169
    add-long v5, v1, v3

    .line 170
    .line 171
    iget-object v1, v0, Lk0/t0$d;->r:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-virtual {v8, v1, v10}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    iget v4, v1, Ld0/I$b;->c:I

    .line 178
    .line 179
    move-object/from16 v1, p1

    .line 180
    .line 181
    move-object/from16 v2, p5

    .line 182
    .line 183
    move-object/from16 v3, p6

    .line 184
    .line 185
    invoke-virtual/range {v1 .. v6}, Ld0/I;->j(Ld0/I$c;Ld0/I$b;IJ)Landroid/util/Pair;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 190
    .line 191
    invoke-virtual {v8, v2}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v3, Ljava/lang/Long;

    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 200
    .line 201
    .line 202
    move-result-wide v3

    .line 203
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 204
    .line 205
    invoke-virtual {p0, v2, v3, v4, v1}, Lk0/t0$d;->e(IJLjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_6
    return v12
.end method

.method public static G0(Ld0/I;Lk0/U0;Lk0/t0$h;Lk0/E0;IZLd0/I$c;Ld0/I$b;)Lk0/t0$g;
    .locals 30

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p5

    .line 8
    .line 9
    move-object/from16 v11, p7

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p0}, Ld0/I;->q()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lk0/t0$g;

    .line 18
    .line 19
    invoke-static {}, Lk0/U0;->l()Lx0/x$b;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v8, 0x1

    .line 24
    const/4 v9, 0x0

    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    move-object v1, v0

    .line 34
    invoke-direct/range {v1 .. v9}, Lk0/t0$g;-><init>(Lx0/x$b;JJZZZ)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    iget-object v14, v8, Lk0/U0;->b:Lx0/x$b;

    .line 39
    .line 40
    iget-object v12, v14, Lx0/x$b;->a:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-static {v8, v11}, Lk0/t0;->Z(Lk0/U0;Ld0/I$b;)Z

    .line 43
    .line 44
    .line 45
    move-result v13

    .line 46
    iget-object v0, v8, Lk0/U0;->b:Lx0/x$b;

    .line 47
    .line 48
    invoke-virtual {v0}, Lx0/x$b;->b()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    if-eqz v13, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    iget-wide v0, v8, Lk0/U0;->s:J

    .line 58
    .line 59
    :goto_0
    move-wide v15, v0

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    :goto_1
    iget-wide v0, v8, Lk0/U0;->c:J

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :goto_2
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    const/16 v19, 0x0

    .line 70
    .line 71
    const/4 v6, -0x1

    .line 72
    const/16 v20, 0x1

    .line 73
    .line 74
    if-eqz v9, :cond_6

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    move-object/from16 v0, p0

    .line 78
    .line 79
    move-object/from16 v1, p2

    .line 80
    .line 81
    move/from16 v3, p4

    .line 82
    .line 83
    move/from16 v4, p5

    .line 84
    .line 85
    move-object/from16 v5, p6

    .line 86
    .line 87
    move-object/from16 v21, v14

    .line 88
    .line 89
    move v14, v6

    .line 90
    move-object/from16 v6, p7

    .line 91
    .line 92
    invoke-static/range {v0 .. v6}, Lk0/t0;->H0(Ld0/I;Lk0/t0$h;ZIZLd0/I$c;Ld0/I$b;)Landroid/util/Pair;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-nez v0, :cond_3

    .line 97
    .line 98
    invoke-virtual {v7, v10}, Ld0/I;->a(Z)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    move v6, v0

    .line 103
    move-wide v0, v15

    .line 104
    move/from16 v2, v19

    .line 105
    .line 106
    move v3, v2

    .line 107
    move/from16 v4, v20

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_3
    iget-wide v1, v9, Lk0/t0$h;->c:J

    .line 111
    .line 112
    cmp-long v1, v1, v17

    .line 113
    .line 114
    if-nez v1, :cond_4

    .line 115
    .line 116
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {v7, v0, v11}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget v6, v0, Ld0/I$b;->c:I

    .line 123
    .line 124
    move-wide v0, v15

    .line 125
    move/from16 v2, v19

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_4
    iget-object v12, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 129
    .line 130
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Ljava/lang/Long;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v0

    .line 138
    move v6, v14

    .line 139
    move/from16 v2, v20

    .line 140
    .line 141
    :goto_3
    iget v3, v8, Lk0/U0;->e:I

    .line 142
    .line 143
    const/4 v4, 0x4

    .line 144
    if-ne v3, v4, :cond_5

    .line 145
    .line 146
    move/from16 v3, v20

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    move/from16 v3, v19

    .line 150
    .line 151
    :goto_4
    move/from16 v4, v19

    .line 152
    .line 153
    :goto_5
    move-object/from16 v9, p6

    .line 154
    .line 155
    move/from16 v29, v2

    .line 156
    .line 157
    move/from16 v27, v3

    .line 158
    .line 159
    move/from16 v28, v4

    .line 160
    .line 161
    move v3, v6

    .line 162
    :goto_6
    move-object/from16 v6, v21

    .line 163
    .line 164
    goto/16 :goto_a

    .line 165
    .line 166
    :cond_6
    move-object/from16 v21, v14

    .line 167
    .line 168
    move v14, v6

    .line 169
    iget-object v0, v8, Lk0/U0;->a:Ld0/I;

    .line 170
    .line 171
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_7

    .line 176
    .line 177
    invoke-virtual {v7, v10}, Ld0/I;->a(Z)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    :goto_7
    move-object/from16 v9, p6

    .line 182
    .line 183
    move v3, v0

    .line 184
    move-wide v0, v15

    .line 185
    move/from16 v27, v19

    .line 186
    .line 187
    move/from16 v28, v27

    .line 188
    .line 189
    move/from16 v29, v28

    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_7
    invoke-virtual {v7, v12}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-ne v0, v14, :cond_9

    .line 197
    .line 198
    iget-object v5, v8, Lk0/U0;->a:Ld0/I;

    .line 199
    .line 200
    move-object/from16 v0, p6

    .line 201
    .line 202
    move-object/from16 v1, p7

    .line 203
    .line 204
    move/from16 v2, p4

    .line 205
    .line 206
    move/from16 v3, p5

    .line 207
    .line 208
    move-object v4, v12

    .line 209
    move-object/from16 v6, p0

    .line 210
    .line 211
    invoke-static/range {v0 .. v6}, Lk0/t0;->I0(Ld0/I$c;Ld0/I$b;IZLjava/lang/Object;Ld0/I;Ld0/I;)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-ne v0, v14, :cond_8

    .line 216
    .line 217
    invoke-virtual {v7, v10}, Ld0/I;->a(Z)I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    move/from16 v4, v20

    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_8
    move/from16 v4, v19

    .line 225
    .line 226
    :goto_8
    move-object/from16 v9, p6

    .line 227
    .line 228
    move v3, v0

    .line 229
    move/from16 v28, v4

    .line 230
    .line 231
    move-wide v0, v15

    .line 232
    move/from16 v27, v19

    .line 233
    .line 234
    move/from16 v29, v27

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_9
    cmp-long v0, v15, v17

    .line 238
    .line 239
    if-nez v0, :cond_a

    .line 240
    .line 241
    invoke-virtual {v7, v12, v11}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget v0, v0, Ld0/I$b;->c:I

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_a
    if-eqz v13, :cond_c

    .line 249
    .line 250
    iget-object v0, v8, Lk0/U0;->a:Ld0/I;

    .line 251
    .line 252
    move-object/from16 v6, v21

    .line 253
    .line 254
    iget-object v1, v6, Lx0/x$b;->a:Ljava/lang/Object;

    .line 255
    .line 256
    invoke-virtual {v0, v1, v11}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 257
    .line 258
    .line 259
    iget-object v0, v8, Lk0/U0;->a:Ld0/I;

    .line 260
    .line 261
    iget v1, v11, Ld0/I$b;->c:I

    .line 262
    .line 263
    move-object/from16 v9, p6

    .line 264
    .line 265
    invoke-virtual {v0, v1, v9}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    iget v0, v0, Ld0/I$c;->n:I

    .line 270
    .line 271
    iget-object v1, v8, Lk0/U0;->a:Ld0/I;

    .line 272
    .line 273
    iget-object v2, v6, Lx0/x$b;->a:Ljava/lang/Object;

    .line 274
    .line 275
    invoke-virtual {v1, v2}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-ne v0, v1, :cond_b

    .line 280
    .line 281
    invoke-virtual/range {p7 .. p7}, Ld0/I$b;->n()J

    .line 282
    .line 283
    .line 284
    move-result-wide v0

    .line 285
    add-long v4, v15, v0

    .line 286
    .line 287
    invoke-virtual {v7, v12, v11}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    iget v3, v0, Ld0/I$b;->c:I

    .line 292
    .line 293
    move-object/from16 v0, p0

    .line 294
    .line 295
    move-object/from16 v1, p6

    .line 296
    .line 297
    move-object/from16 v2, p7

    .line 298
    .line 299
    invoke-virtual/range {v0 .. v5}, Ld0/I;->j(Ld0/I$c;Ld0/I$b;IJ)Landroid/util/Pair;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    iget-object v12, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 304
    .line 305
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Ljava/lang/Long;

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 310
    .line 311
    .line 312
    move-result-wide v0

    .line 313
    goto :goto_9

    .line 314
    :cond_b
    move-wide v0, v15

    .line 315
    :goto_9
    move v3, v14

    .line 316
    move/from16 v27, v19

    .line 317
    .line 318
    move/from16 v28, v27

    .line 319
    .line 320
    move/from16 v29, v20

    .line 321
    .line 322
    goto :goto_a

    .line 323
    :cond_c
    move-object/from16 v9, p6

    .line 324
    .line 325
    move-object/from16 v6, v21

    .line 326
    .line 327
    move v3, v14

    .line 328
    move-wide v0, v15

    .line 329
    move/from16 v27, v19

    .line 330
    .line 331
    move/from16 v28, v27

    .line 332
    .line 333
    move/from16 v29, v28

    .line 334
    .line 335
    :goto_a
    if-eq v3, v14, :cond_d

    .line 336
    .line 337
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    move-object/from16 v0, p0

    .line 343
    .line 344
    move-object/from16 v1, p6

    .line 345
    .line 346
    move-object/from16 v2, p7

    .line 347
    .line 348
    invoke-virtual/range {v0 .. v5}, Ld0/I;->j(Ld0/I$c;Ld0/I$b;IJ)Landroid/util/Pair;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    iget-object v12, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 353
    .line 354
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, Ljava/lang/Long;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 359
    .line 360
    .line 361
    move-result-wide v0

    .line 362
    move-object/from16 v2, p3

    .line 363
    .line 364
    move-wide/from16 v25, v17

    .line 365
    .line 366
    goto :goto_b

    .line 367
    :cond_d
    move-object/from16 v2, p3

    .line 368
    .line 369
    move-wide/from16 v25, v0

    .line 370
    .line 371
    :goto_b
    invoke-virtual {v2, v7, v12, v0, v1}, Lk0/E0;->L(Ld0/I;Ljava/lang/Object;J)Lx0/x$b;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    iget v3, v2, Lx0/x$b;->e:I

    .line 376
    .line 377
    if-eq v3, v14, :cond_f

    .line 378
    .line 379
    iget v4, v6, Lx0/x$b;->e:I

    .line 380
    .line 381
    if-eq v4, v14, :cond_e

    .line 382
    .line 383
    if-lt v3, v4, :cond_e

    .line 384
    .line 385
    goto :goto_c

    .line 386
    :cond_e
    move/from16 v3, v19

    .line 387
    .line 388
    goto :goto_d

    .line 389
    :cond_f
    :goto_c
    move/from16 v3, v20

    .line 390
    .line 391
    :goto_d
    iget-object v4, v6, Lx0/x$b;->a:Ljava/lang/Object;

    .line 392
    .line 393
    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    if-eqz v4, :cond_10

    .line 398
    .line 399
    invoke-virtual {v6}, Lx0/x$b;->b()Z

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    if-nez v4, :cond_10

    .line 404
    .line 405
    invoke-virtual {v2}, Lx0/x$b;->b()Z

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    if-nez v4, :cond_10

    .line 410
    .line 411
    if-eqz v3, :cond_10

    .line 412
    .line 413
    goto :goto_e

    .line 414
    :cond_10
    move/from16 v20, v19

    .line 415
    .line 416
    :goto_e
    invoke-virtual {v7, v12, v11}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 417
    .line 418
    .line 419
    move-result-object v17

    .line 420
    move v12, v13

    .line 421
    move-object v13, v6

    .line 422
    move-object v3, v6

    .line 423
    move-wide v14, v15

    .line 424
    move-object/from16 v16, v2

    .line 425
    .line 426
    move-wide/from16 v18, v25

    .line 427
    .line 428
    invoke-static/range {v12 .. v19}, Lk0/t0;->V(ZLx0/x$b;JLx0/x$b;Ld0/I$b;J)Z

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    if-nez v20, :cond_11

    .line 433
    .line 434
    if-eqz v4, :cond_12

    .line 435
    .line 436
    :cond_11
    move-object v2, v3

    .line 437
    :cond_12
    invoke-virtual {v2}, Lx0/x$b;->b()Z

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    if-eqz v4, :cond_13

    .line 442
    .line 443
    invoke-virtual {v2, v3}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-eqz v0, :cond_14

    .line 448
    .line 449
    iget-wide v0, v8, Lk0/U0;->s:J

    .line 450
    .line 451
    :cond_13
    :goto_f
    move-wide/from16 v23, v0

    .line 452
    .line 453
    goto :goto_10

    .line 454
    :cond_14
    iget-object v0, v2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 455
    .line 456
    invoke-virtual {v7, v0, v11}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 457
    .line 458
    .line 459
    iget v0, v2, Lx0/x$b;->c:I

    .line 460
    .line 461
    iget v1, v2, Lx0/x$b;->b:I

    .line 462
    .line 463
    invoke-virtual {v11, v1}, Ld0/I$b;->k(I)I

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    if-ne v0, v1, :cond_15

    .line 468
    .line 469
    invoke-virtual/range {p7 .. p7}, Ld0/I$b;->g()J

    .line 470
    .line 471
    .line 472
    move-result-wide v0

    .line 473
    goto :goto_f

    .line 474
    :cond_15
    const-wide/16 v0, 0x0

    .line 475
    .line 476
    goto :goto_f

    .line 477
    :goto_10
    new-instance v0, Lk0/t0$g;

    .line 478
    .line 479
    move-object/from16 v21, v0

    .line 480
    .line 481
    move-object/from16 v22, v2

    .line 482
    .line 483
    invoke-direct/range {v21 .. v29}, Lk0/t0$g;-><init>(Lx0/x$b;JJZZZ)V

    .line 484
    .line 485
    .line 486
    return-object v0
.end method

.method public static H0(Ld0/I;Lk0/t0$h;ZIZLd0/I$c;Ld0/I$b;)Landroid/util/Pair;
    .locals 13

    .line 1
    move-object v7, p0

    .line 2
    move-object v0, p1

    .line 3
    move-object/from16 v8, p6

    .line 4
    .line 5
    iget-object v1, v0, Lk0/t0$h;->a:Ld0/I;

    .line 6
    .line 7
    invoke-virtual {p0}, Ld0/I;->q()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v9, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    return-object v9

    .line 15
    :cond_0
    invoke-virtual {v1}, Ld0/I;->q()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    move-object v10, v7

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object v10, v1

    .line 24
    :goto_0
    :try_start_0
    iget v4, v0, Lk0/t0$h;->b:I

    .line 25
    .line 26
    iget-wide v5, v0, Lk0/t0$h;->c:J

    .line 27
    .line 28
    move-object v1, v10

    .line 29
    move-object/from16 v2, p5

    .line 30
    .line 31
    move-object/from16 v3, p6

    .line 32
    .line 33
    invoke-virtual/range {v1 .. v6}, Ld0/I;->j(Ld0/I$c;Ld0/I$b;IJ)Landroid/util/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    invoke-virtual {p0, v10}, Ld0/I;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_2
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v11, -0x1

    .line 51
    if-eq v2, v11, :cond_4

    .line 52
    .line 53
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v10, v2, v8}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-boolean v2, v2, Ld0/I$b;->f:Z

    .line 60
    .line 61
    if-eqz v2, :cond_3

    .line 62
    .line 63
    iget v2, v8, Ld0/I$b;->c:I

    .line 64
    .line 65
    move-object/from16 v12, p5

    .line 66
    .line 67
    invoke-virtual {v10, v2, v12}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget v2, v2, Ld0/I$c;->n:I

    .line 72
    .line 73
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-virtual {v10, v3}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-ne v2, v3, :cond_3

    .line 80
    .line 81
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-virtual {p0, v1, v8}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget v3, v1, Ld0/I$b;->c:I

    .line 88
    .line 89
    iget-wide v4, v0, Lk0/t0$h;->c:J

    .line 90
    .line 91
    move-object v0, p0

    .line 92
    move-object/from16 v1, p5

    .line 93
    .line 94
    move-object/from16 v2, p6

    .line 95
    .line 96
    invoke-virtual/range {v0 .. v5}, Ld0/I;->j(Ld0/I$c;Ld0/I$b;IJ)Landroid/util/Pair;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :cond_3
    return-object v1

    .line 101
    :cond_4
    move-object/from16 v12, p5

    .line 102
    .line 103
    if-eqz p2, :cond_5

    .line 104
    .line 105
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 106
    .line 107
    move-object/from16 v0, p5

    .line 108
    .line 109
    move-object/from16 v1, p6

    .line 110
    .line 111
    move/from16 v2, p3

    .line 112
    .line 113
    move/from16 v3, p4

    .line 114
    .line 115
    move-object v5, v10

    .line 116
    move-object v6, p0

    .line 117
    invoke-static/range {v0 .. v6}, Lk0/t0;->I0(Ld0/I$c;Ld0/I$b;IZLjava/lang/Object;Ld0/I;Ld0/I;)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eq v3, v11, :cond_5

    .line 122
    .line 123
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    move-object v0, p0

    .line 129
    move-object/from16 v1, p5

    .line 130
    .line 131
    move-object/from16 v2, p6

    .line 132
    .line 133
    invoke-virtual/range {v0 .. v5}, Ld0/I;->j(Ld0/I$c;Ld0/I$b;IJ)Landroid/util/Pair;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :catch_0
    :cond_5
    return-object v9
.end method

.method public static I0(Ld0/I$c;Ld0/I$b;IZLjava/lang/Object;Ld0/I;Ld0/I;)I
    .locals 9

    .line 1
    invoke-virtual {p5, p4, p1}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v0, v0, Ld0/I$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p5, v0, p0}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, Ld0/I$c;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    invoke-virtual {p6}, Ld0/I;->p()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-ge v2, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p6, v2, p0}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v3, v3, Ld0/I$c;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    return v2

    .line 34
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p5, p4}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    invoke-virtual {p5}, Ld0/I;->i()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v2, -0x1

    .line 46
    move v4, p4

    .line 47
    move p4, v2

    .line 48
    :goto_1
    if-ge v1, v0, :cond_3

    .line 49
    .line 50
    if-ne p4, v2, :cond_3

    .line 51
    .line 52
    move-object v3, p5

    .line 53
    move-object v5, p1

    .line 54
    move-object v6, p0

    .line 55
    move v7, p2

    .line 56
    move v8, p3

    .line 57
    invoke-virtual/range {v3 .. v8}, Ld0/I;->d(ILd0/I$b;Ld0/I$c;IZ)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ne v4, v2, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {p5, v4}, Ld0/I;->m(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p4

    .line 68
    invoke-virtual {p6, p4}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    :goto_2
    if-ne p4, v2, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-virtual {p6, p4, p1}, Ld0/I;->f(ILd0/I$b;)Ld0/I$b;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget v2, p0, Ld0/I$b;->c:I

    .line 83
    .line 84
    :goto_3
    return v2
.end method

.method public static V(ZLx0/x$b;JLx0/x$b;Ld0/I$b;J)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_3

    .line 3
    .line 4
    cmp-long p0, p2, p6

    .line 5
    .line 6
    if-nez p0, :cond_3

    .line 7
    .line 8
    iget-object p0, p1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p2, p4, Lx0/x$b;->a:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Lx0/x$b;->b()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 p2, 0x1

    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    iget p0, p1, Lx0/x$b;->b:I

    .line 27
    .line 28
    invoke-virtual {p5, p0}, Ld0/I$b;->r(I)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    iget p0, p1, Lx0/x$b;->b:I

    .line 35
    .line 36
    iget p3, p1, Lx0/x$b;->c:I

    .line 37
    .line 38
    invoke-virtual {p5, p0, p3}, Ld0/I$b;->h(II)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const/4 p3, 0x4

    .line 43
    if-eq p0, p3, :cond_1

    .line 44
    .line 45
    iget p0, p1, Lx0/x$b;->b:I

    .line 46
    .line 47
    iget p1, p1, Lx0/x$b;->c:I

    .line 48
    .line 49
    invoke-virtual {p5, p0, p1}, Ld0/I$b;->h(II)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    const/4 p1, 0x2

    .line 54
    if-eq p0, p1, :cond_1

    .line 55
    .line 56
    move v0, p2

    .line 57
    :cond_1
    return v0

    .line 58
    :cond_2
    invoke-virtual {p4}, Lx0/x$b;->b()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    iget p0, p4, Lx0/x$b;->b:I

    .line 65
    .line 66
    invoke-virtual {p5, p0}, Ld0/I$b;->r(I)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    move v0, p2

    .line 73
    :cond_3
    :goto_0
    return v0
.end method

.method public static X(Lk0/Y0;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Lk0/Y0;->getState()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    :goto_0
    return p0
.end method

.method public static Z(Lk0/U0;Ld0/I$b;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/U0;->b:Lx0/x$b;

    .line 2
    .line 3
    iget-object p0, p0, Lk0/U0;->a:Ld0/I;

    .line 4
    .line 5
    invoke-virtual {p0}, Ld0/I;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, Lx0/x$b;->a:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-boolean p0, p0, Ld0/I$b;->f:Z

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    :goto_1
    return p0
.end method

.method public static synthetic f(Lk0/t0;Lk0/C0;J)Lk0/B0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lk0/t0;->t(Lk0/C0;J)Lk0/B0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Lk0/t0;Lk0/V0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk0/t0;->b0(Lk0/V0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Lk0/t0;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk0/t0;->a0()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic i(Lk0/t0;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk0/t0;->Y:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic l(Lk0/t0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lk0/t0;->L:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic n(Lk0/t0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lk0/t0;->Z:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic p(Lk0/t0;)Lg0/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final A(Lk0/Y0;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lk0/Y0;->getState()I

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
    invoke-interface {p1}, Lk0/Y0;->stop()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final A0(ZZZZ)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    iget-object v0, v1, Lk0/t0;->v:Lg0/k;

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Lg0/k;->f(I)V

    const/4 v2, 0x0

    iput-object v2, v1, Lk0/t0;->g0:Lk0/u;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v1, v3, v4}, Lk0/t0;->B1(ZZ)V

    iget-object v0, v1, Lk0/t0;->C:Lk0/s;

    invoke-virtual {v0}, Lk0/s;->f()V

    const-wide v5, 0xe8d4a51000L

    iput-wide v5, v1, Lk0/t0;->c0:J

    iget-object v5, v1, Lk0/t0;->o:[Lk0/Y0;

    array-length v6, v5

    move v7, v3

    :goto_0
    const-string v8, "ExoPlayerImplInternal"

    if-ge v7, v6, :cond_0

    aget-object v0, v5, v7

    :try_start_0
    invoke-virtual {v1, v0}, Lk0/t0;->v(Lk0/Y0;)V
    :try_end_0
    .catch Lk0/u; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    const-string v9, "Disable failed."

    invoke-static {v8, v9, v0}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    iget-object v5, v1, Lk0/t0;->o:[Lk0/Y0;

    array-length v6, v5

    move v7, v3

    :goto_3
    if-ge v7, v6, :cond_2

    aget-object v0, v5, v7

    iget-object v9, v1, Lk0/t0;->p:Ljava/util/Set;

    invoke-interface {v9, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    :try_start_1
    invoke-interface {v0}, Lk0/Y0;->b()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_4

    :catch_2
    move-exception v0

    move-object v9, v0

    const-string v0, "Reset failed."

    invoke-static {v8, v0, v9}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_2
    iput v3, v1, Lk0/t0;->a0:I

    iget-object v0, v1, Lk0/t0;->N:Lk0/U0;

    iget-object v5, v0, Lk0/U0;->b:Lx0/x$b;

    iget-wide v6, v0, Lk0/U0;->s:J

    iget-object v0, v1, Lk0/t0;->N:Lk0/U0;

    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    invoke-virtual {v0}, Lx0/x$b;->b()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, Lk0/t0;->N:Lk0/U0;

    iget-object v8, v1, Lk0/t0;->z:Ld0/I$b;

    invoke-static {v0, v8}, Lk0/t0;->Z(Lk0/U0;Ld0/I$b;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_5

    :cond_3
    iget-object v0, v1, Lk0/t0;->N:Lk0/U0;

    iget-wide v8, v0, Lk0/U0;->s:J

    goto :goto_6

    :cond_4
    :goto_5
    iget-object v0, v1, Lk0/t0;->N:Lk0/U0;

    iget-wide v8, v0, Lk0/U0;->c:J

    :goto_6
    if-eqz p2, :cond_5

    iput-object v2, v1, Lk0/t0;->b0:Lk0/t0$h;

    iget-object v0, v1, Lk0/t0;->N:Lk0/U0;

    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    invoke-virtual {v1, v0}, Lk0/t0;->H(Ld0/I;)Landroid/util/Pair;

    move-result-object v0

    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Lx0/x$b;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v0, v1, Lk0/t0;->N:Lk0/U0;

    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    invoke-virtual {v5, v0}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_5

    :goto_7
    move-wide/from16 v28, v6

    move-wide v9, v8

    goto :goto_8

    :cond_5
    move v4, v3

    goto :goto_7

    :goto_8
    iget-object v0, v1, Lk0/t0;->G:Lk0/E0;

    invoke-virtual {v0}, Lk0/E0;->f()V

    iput-boolean v3, v1, Lk0/t0;->U:Z

    iget-object v0, v1, Lk0/t0;->N:Lk0/U0;

    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    if-eqz p3, :cond_6

    instance-of v3, v0, Lk0/W0;

    if-eqz v3, :cond_6

    check-cast v0, Lk0/W0;

    iget-object v3, v1, Lk0/t0;->H:Lk0/T0;

    invoke-virtual {v3}, Lk0/T0;->q()Lx0/T;

    move-result-object v3

    invoke-virtual {v0, v3}, Lk0/W0;->E(Lx0/T;)Lk0/W0;

    move-result-object v0

    iget v3, v5, Lx0/x$b;->b:I

    const/4 v6, -0x1

    if-eq v3, v6, :cond_6

    iget-object v3, v5, Lx0/x$b;->a:Ljava/lang/Object;

    iget-object v6, v1, Lk0/t0;->z:Ld0/I$b;

    invoke-virtual {v0, v3, v6}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    iget-object v3, v1, Lk0/t0;->z:Ld0/I$b;

    iget v3, v3, Ld0/I$b;->c:I

    iget-object v6, v1, Lk0/t0;->y:Ld0/I$c;

    invoke-virtual {v0, v3, v6}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    move-result-object v3

    invoke-virtual {v3}, Ld0/I$c;->f()Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v3, Lx0/x$b;

    iget-object v6, v5, Lx0/x$b;->a:Ljava/lang/Object;

    iget-wide v7, v5, Lx0/x$b;->d:J

    invoke-direct {v3, v6, v7, v8}, Lx0/x$b;-><init>(Ljava/lang/Object;J)V

    move-object v7, v0

    move-object/from16 v19, v3

    goto :goto_9

    :cond_6
    move-object v7, v0

    move-object/from16 v19, v5

    :goto_9
    new-instance v0, Lk0/U0;

    iget-object v3, v1, Lk0/t0;->N:Lk0/U0;

    iget v13, v3, Lk0/U0;->e:I

    if-eqz p4, :cond_7

    :goto_a
    move-object v14, v2

    goto :goto_b

    :cond_7
    iget-object v2, v3, Lk0/U0;->f:Lk0/u;

    goto :goto_a

    :goto_b
    if-eqz v4, :cond_8

    sget-object v2, Lx0/Z;->d:Lx0/Z;

    :goto_c
    move-object/from16 v16, v2

    goto :goto_d

    :cond_8
    iget-object v2, v3, Lk0/U0;->h:Lx0/Z;

    goto :goto_c

    :goto_d
    if-eqz v4, :cond_9

    iget-object v2, v1, Lk0/t0;->s:LA0/E;

    :goto_e
    move-object/from16 v17, v2

    goto :goto_f

    :cond_9
    iget-object v2, v3, Lk0/U0;->i:LA0/E;

    goto :goto_e

    :goto_f
    if-eqz v4, :cond_a

    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v2

    :goto_10
    move-object/from16 v18, v2

    goto :goto_11

    :cond_a
    iget-object v2, v3, Lk0/U0;->j:Ljava/util/List;

    goto :goto_10

    :goto_11
    iget-object v2, v1, Lk0/t0;->N:Lk0/U0;

    iget-boolean v3, v2, Lk0/U0;->l:Z

    move/from16 v20, v3

    iget v3, v2, Lk0/U0;->m:I

    move/from16 v21, v3

    iget v3, v2, Lk0/U0;->n:I

    move/from16 v22, v3

    iget-object v2, v2, Lk0/U0;->o:Ld0/C;

    move-object/from16 v23, v2

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/4 v15, 0x0

    const-wide/16 v26, 0x0

    move-object v6, v0

    move-object/from16 v8, v19

    move-wide/from16 v11, v28

    move-wide/from16 v24, v28

    invoke-direct/range {v6 .. v32}, Lk0/U0;-><init>(Ld0/I;Lx0/x$b;JJILk0/u;ZLx0/Z;LA0/E;Ljava/util/List;Lx0/x$b;ZIILd0/C;JJJJZ)V

    iput-object v0, v1, Lk0/t0;->N:Lk0/U0;

    if-eqz p3, :cond_b

    iget-object v0, v1, Lk0/t0;->G:Lk0/E0;

    invoke-virtual {v0}, Lk0/E0;->H()V

    iget-object v0, v1, Lk0/t0;->H:Lk0/T0;

    invoke-virtual {v0}, Lk0/T0;->y()V

    :cond_b
    return-void
.end method

.method public final A1(Ld0/I;Lx0/x$b;Ld0/I;Lx0/x$b;JZ)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lk0/t0;->q1(Ld0/I;Lx0/x$b;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p2}, Lx0/x$b;->b()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Ld0/C;->d:Ld0/C;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Lk0/t0;->N:Lk0/U0;

    .line 17
    .line 18
    iget-object p1, p1, Lk0/U0;->o:Ld0/C;

    .line 19
    .line 20
    :goto_0
    iget-object p2, p0, Lk0/t0;->C:Lk0/s;

    .line 21
    .line 22
    invoke-virtual {p2}, Lk0/s;->h()Ld0/C;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p2, p1}, Ld0/C;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lk0/t0;->V0(Ld0/C;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lk0/t0;->N:Lk0/U0;

    .line 36
    .line 37
    iget-object p2, p2, Lk0/U0;->o:Ld0/C;

    .line 38
    .line 39
    iget p1, p1, Ld0/C;->a:F

    .line 40
    .line 41
    const/4 p3, 0x0

    .line 42
    invoke-virtual {p0, p2, p1, p3, p3}, Lk0/t0;->Q(Ld0/C;FZZ)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void

    .line 46
    :cond_2
    iget-object v0, p2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v1, p0, Lk0/t0;->z:Ld0/I$b;

    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v0, v0, Ld0/I$b;->c:I

    .line 55
    .line 56
    iget-object v1, p0, Lk0/t0;->y:Ld0/I$c;

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lk0/t0;->I:Lk0/w0;

    .line 62
    .line 63
    iget-object v1, p0, Lk0/t0;->y:Ld0/I$c;

    .line 64
    .line 65
    iget-object v1, v1, Ld0/I$c;->j:Ld0/u$g;

    .line 66
    .line 67
    invoke-static {v1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ld0/u$g;

    .line 72
    .line 73
    invoke-interface {v0, v1}, Lk0/w0;->b(Ld0/u$g;)V

    .line 74
    .line 75
    .line 76
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    cmp-long v2, p5, v0

    .line 82
    .line 83
    if-eqz v2, :cond_3

    .line 84
    .line 85
    iget-object p3, p0, Lk0/t0;->I:Lk0/w0;

    .line 86
    .line 87
    iget-object p2, p2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-virtual {p0, p1, p2, p5, p6}, Lk0/t0;->F(Ld0/I;Ljava/lang/Object;J)J

    .line 90
    .line 91
    .line 92
    move-result-wide p1

    .line 93
    invoke-interface {p3, p1, p2}, Lk0/w0;->d(J)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    iget-object p1, p0, Lk0/t0;->y:Ld0/I$c;

    .line 98
    .line 99
    iget-object p1, p1, Ld0/I$c;->a:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-virtual {p3}, Ld0/I;->q()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-nez p2, :cond_4

    .line 106
    .line 107
    iget-object p2, p4, Lx0/x$b;->a:Ljava/lang/Object;

    .line 108
    .line 109
    iget-object p4, p0, Lk0/t0;->z:Ld0/I$b;

    .line 110
    .line 111
    invoke-virtual {p3, p2, p4}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    iget p2, p2, Ld0/I$b;->c:I

    .line 116
    .line 117
    iget-object p4, p0, Lk0/t0;->y:Ld0/I$c;

    .line 118
    .line 119
    invoke-virtual {p3, p2, p4}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    iget-object p2, p2, Ld0/I$c;->a:Ljava/lang/Object;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    const/4 p2, 0x0

    .line 127
    :goto_1
    invoke-static {p2, p1}, Lg0/M;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_5

    .line 132
    .line 133
    if-eqz p7, :cond_6

    .line 134
    .line 135
    :cond_5
    iget-object p1, p0, Lk0/t0;->I:Lk0/w0;

    .line 136
    .line 137
    invoke-interface {p1, v0, v1}, Lk0/w0;->d(J)V

    .line 138
    .line 139
    .line 140
    :cond_6
    :goto_2
    return-void
.end method

.method public B(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lk0/t0;->h0:J

    .line 2
    .line 3
    return-void
.end method

.method public final B0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lk0/B0;->f:Lk0/C0;

    .line 10
    .line 11
    iget-boolean v0, v0, Lk0/C0;->h:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, p0, Lk0/t0;->Q:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iput-boolean v0, p0, Lk0/t0;->R:Z

    .line 23
    .line 24
    return-void
.end method

.method public final B1(ZZ)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lk0/t0;->S:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lk0/t0;->E:Lg0/c;

    .line 8
    .line 9
    invoke-interface {p1}, Lg0/c;->b()J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    :goto_0
    iput-wide p1, p0, Lk0/t0;->T:J

    .line 20
    .line 21
    return-void
.end method

.method public final C([LA0/y;)LX2/v;
    .locals 7

    .line 1
    new-instance v0, LX2/v$a;

    .line 2
    .line 3
    invoke-direct {v0}, LX2/v$a;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v3, v1, :cond_2

    .line 11
    .line 12
    aget-object v5, p1, v3

    .line 13
    .line 14
    if-eqz v5, :cond_1

    .line 15
    .line 16
    invoke-interface {v5, v2}, LA0/B;->b(I)Ld0/q;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    iget-object v5, v5, Ld0/q;->k:Ld0/x;

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    new-instance v5, Ld0/x;

    .line 25
    .line 26
    new-array v6, v2, [Ld0/x$b;

    .line 27
    .line 28
    invoke-direct {v5, v6}, Ld0/x;-><init>([Ld0/x$b;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v5}, LX2/v$a;->h(Ljava/lang/Object;)LX2/v$a;

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {v0, v5}, LX2/v$a;->h(Ljava/lang/Object;)LX2/v$a;

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    if-eqz v4, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, LX2/v$a;->k()LX2/v;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_2
    return-object p1
.end method

.method public final C0(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide v0, 0xe8d4a51000L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    add-long/2addr p1, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0, p1, p2}, Lk0/B0;->B(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    :goto_0
    iput-wide p1, p0, Lk0/t0;->c0:J

    .line 21
    .line 22
    iget-object v0, p0, Lk0/t0;->C:Lk0/s;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lk0/s;->c(J)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 28
    .line 29
    array-length p2, p1

    .line 30
    const/4 v0, 0x0

    .line 31
    :goto_1
    if-ge v0, p2, :cond_2

    .line 32
    .line 33
    aget-object v1, p1, v0

    .line 34
    .line 35
    invoke-static {v1}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-wide v2, p0, Lk0/t0;->c0:J

    .line 42
    .line 43
    invoke-interface {v1, v2, v3}, Lk0/Y0;->z(J)V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {p0}, Lk0/t0;->n0()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final C1(F)V
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lk0/B0;->p()LA0/E;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, LA0/E;->c:[LA0/y;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4, p1}, LA0/y;->r(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lk0/B0;->k()Lk0/B0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method public final D()J
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 2
    .line 3
    iget-object v1, v0, Lk0/U0;->a:Ld0/I;

    .line 4
    .line 5
    iget-object v2, v0, Lk0/U0;->b:Lx0/x$b;

    .line 6
    .line 7
    iget-object v2, v2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iget-wide v3, v0, Lk0/U0;->s:J

    .line 10
    .line 11
    invoke-virtual {p0, v1, v2, v3, v4}, Lk0/t0;->F(Ld0/I;Ljava/lang/Object;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method public final declared-synchronized D1(LW2/s;J)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lk0/t0;->E:Lg0/c;

    .line 3
    .line 4
    invoke-interface {v0}, Lg0/c;->b()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    add-long/2addr v0, p2

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    invoke-interface {p1}, LW2/s;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    cmp-long v3, p2, v3

    .line 25
    .line 26
    if-lez v3, :cond_0

    .line 27
    .line 28
    :try_start_1
    iget-object v3, p0, Lk0/t0;->E:Lg0/c;

    .line 29
    .line 30
    invoke-interface {v3}, Lg0/c;->f()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_2

    .line 39
    :catch_0
    const/4 p2, 0x1

    .line 40
    move v2, p2

    .line 41
    :goto_1
    :try_start_2
    iget-object p2, p0, Lk0/t0;->E:Lg0/c;

    .line 42
    .line 43
    invoke-interface {p2}, Lg0/c;->b()J

    .line 44
    .line 45
    .line 46
    move-result-wide p2

    .line 47
    sub-long p2, v0, p2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .line 58
    .line 59
    :cond_1
    monitor-exit p0

    .line 60
    return-void

    .line 61
    :goto_2
    monitor-exit p0

    .line 62
    throw p1
.end method

.method public final F(Ld0/I;Ljava/lang/Object;J)J
    .locals 4

    .line 1
    iget-object v0, p0, Lk0/t0;->z:Ld0/I$b;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, Ld0/I$b;->c:I

    .line 8
    .line 9
    iget-object v0, p0, Lk0/t0;->y:Ld0/I$c;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v0}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lk0/t0;->y:Ld0/I$c;

    .line 15
    .line 16
    iget-wide v0, p1, Ld0/I$c;->f:J

    .line 17
    .line 18
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p2, v0, v2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Ld0/I$c;->f()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lk0/t0;->y:Ld0/I$c;

    .line 34
    .line 35
    iget-boolean p2, p1, Ld0/I$c;->i:Z

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p1}, Ld0/I$c;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iget-object v0, p0, Lk0/t0;->y:Ld0/I$c;

    .line 45
    .line 46
    iget-wide v0, v0, Ld0/I$c;->f:J

    .line 47
    .line 48
    sub-long/2addr p1, v0

    .line 49
    invoke-static {p1, p2}, Lg0/M;->J0(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide p1

    .line 53
    iget-object v0, p0, Lk0/t0;->z:Ld0/I$b;

    .line 54
    .line 55
    invoke-virtual {v0}, Ld0/I$b;->n()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    add-long/2addr p3, v0

    .line 60
    sub-long/2addr p1, p3

    .line 61
    return-wide p1

    .line 62
    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final F0(Ld0/I;Ld0/I;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ld0/I;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Ld0/I;->q()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    :goto_0
    if-ltz v0, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, Lk0/t0$d;

    .line 32
    .line 33
    iget v5, p0, Lk0/t0;->V:I

    .line 34
    .line 35
    iget-boolean v6, p0, Lk0/t0;->W:Z

    .line 36
    .line 37
    iget-object v7, p0, Lk0/t0;->y:Ld0/I$c;

    .line 38
    .line 39
    iget-object v8, p0, Lk0/t0;->z:Ld0/I$b;

    .line 40
    .line 41
    move-object v3, p1

    .line 42
    move-object v4, p2

    .line 43
    invoke-static/range {v2 .. v8}, Lk0/t0;->E0(Lk0/t0$d;Ld0/I;Ld0/I;IZLd0/I$c;Ld0/I$b;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lk0/t0$d;

    .line 56
    .line 57
    iget-object v1, v1, Lk0/t0$d;->o:Lk0/V0;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v1, v2}, Lk0/V0;->k(Z)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iget-object p1, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final G()J
    .locals 9

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->u()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lk0/B0;->m()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iget-boolean v3, v0, Lk0/B0;->d:Z

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    return-wide v1

    .line 21
    :cond_1
    const/4 v3, 0x0

    .line 22
    :goto_0
    iget-object v4, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 23
    .line 24
    array-length v5, v4

    .line 25
    if-ge v3, v5, :cond_5

    .line 26
    .line 27
    aget-object v4, v4, v3

    .line 28
    .line 29
    invoke-static {v4}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_4

    .line 34
    .line 35
    iget-object v4, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 36
    .line 37
    aget-object v4, v4, v3

    .line 38
    .line 39
    invoke-interface {v4}, Lk0/Y0;->i()Lx0/Q;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v5, v0, Lk0/B0;->c:[Lx0/Q;

    .line 44
    .line 45
    aget-object v5, v5, v3

    .line 46
    .line 47
    if-eq v4, v5, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-object v4, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 51
    .line 52
    aget-object v4, v4, v3

    .line 53
    .line 54
    invoke-interface {v4}, Lk0/Y0;->w()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    const-wide/high16 v6, -0x8000000000000000L

    .line 59
    .line 60
    cmp-long v8, v4, v6

    .line 61
    .line 62
    if-nez v8, :cond_3

    .line 63
    .line 64
    return-wide v6

    .line 65
    :cond_3
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    return-wide v1
.end method

.method public final H(Ld0/I;)Landroid/util/Pair;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ld0/I;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lk0/U0;->l()Lx0/x$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-boolean v0, p0, Lk0/t0;->W:Z

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ld0/I;->a(Z)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    iget-object v4, p0, Lk0/t0;->y:Ld0/I$c;

    .line 29
    .line 30
    iget-object v5, p0, Lk0/t0;->z:Ld0/I$b;

    .line 31
    .line 32
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    move-object v3, p1

    .line 38
    invoke-virtual/range {v3 .. v8}, Ld0/I;->j(Ld0/I$c;Ld0/I$b;IJ)Landroid/util/Pair;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v3, p0, Lk0/t0;->G:Lk0/E0;

    .line 43
    .line 44
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v3, p1, v4, v1, v2}, Lk0/E0;->L(Ld0/I;Ljava/lang/Object;J)Lx0/x$b;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    invoke-virtual {v3}, Lx0/x$b;->b()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    iget-object v0, v3, Lx0/x$b;->a:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v4, p0, Lk0/t0;->z:Ld0/I$b;

    .line 67
    .line 68
    invoke-virtual {p1, v0, v4}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 69
    .line 70
    .line 71
    iget p1, v3, Lx0/x$b;->c:I

    .line 72
    .line 73
    iget-object v0, p0, Lk0/t0;->z:Ld0/I$b;

    .line 74
    .line 75
    iget v4, v3, Lx0/x$b;->b:I

    .line 76
    .line 77
    invoke-virtual {v0, v4}, Ld0/I$b;->k(I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne p1, v0, :cond_1

    .line 82
    .line 83
    iget-object p1, p0, Lk0/t0;->z:Ld0/I$b;

    .line 84
    .line 85
    invoke-virtual {p1}, Ld0/I$b;->g()J

    .line 86
    .line 87
    .line 88
    move-result-wide v1

    .line 89
    :cond_1
    move-wide v4, v1

    .line 90
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {v3, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1
.end method

.method public I()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/t0;->x:Landroid/os/Looper;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 2
    .line 3
    iget-wide v0, v0, Lk0/U0;->q:J

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lk0/t0;->K(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final J0(J)V
    .locals 10

    .line 1
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 2
    .line 3
    iget v0, v0, Lk0/U0;->e:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Lk0/t0;->L:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lk0/t0;->o1()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    const-wide/16 v0, 0x3e8

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-wide v0, Lk0/t0;->l0:J

    .line 22
    .line 23
    :goto_0
    iget-boolean v2, p0, Lk0/t0;->L:Z

    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    invoke-virtual {p0}, Lk0/t0;->o1()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    iget-object v2, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 34
    .line 35
    array-length v3, v2

    .line 36
    const/4 v4, 0x0

    .line 37
    :goto_1
    if-ge v4, v3, :cond_3

    .line 38
    .line 39
    aget-object v5, v2, v4

    .line 40
    .line 41
    invoke-static {v5}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_2

    .line 46
    .line 47
    iget-wide v6, p0, Lk0/t0;->c0:J

    .line 48
    .line 49
    iget-wide v8, p0, Lk0/t0;->d0:J

    .line 50
    .line 51
    invoke-interface {v5, v6, v7, v8, v9}, Lk0/Y0;->q(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v5

    .line 55
    invoke-static {v5, v6}, Lg0/M;->i1(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iget-object v2, p0, Lk0/t0;->v:Lg0/k;

    .line 67
    .line 68
    const/4 v3, 0x2

    .line 69
    add-long/2addr p1, v0

    .line 70
    invoke-interface {v2, v3, p1, p2}, Lg0/k;->e(IJ)Z

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final K(J)J
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->m()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-wide v1

    .line 12
    :cond_0
    iget-wide v3, p0, Lk0/t0;->c0:J

    .line 13
    .line 14
    invoke-virtual {v0, v3, v4}, Lk0/B0;->A(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    sub-long/2addr p1, v3

    .line 19
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1
.end method

.method public K0(Ld0/I;IJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    new-instance v1, Lk0/t0$h;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3, p4}, Lk0/t0$h;-><init>(Ld0/I;IJ)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    invoke-interface {v0, p1, v1}, Lg0/k;->g(ILjava/lang/Object;)Lg0/k$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p1}, Lg0/k$a;->a()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final L(Lx0/v;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk0/E0;->B(Lx0/v;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lk0/t0;->G:Lk0/E0;

    .line 11
    .line 12
    iget-wide v0, p0, Lk0/t0;->c0:J

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Lk0/E0;->F(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lk0/t0;->c0()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final L0(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lk0/B0;->f:Lk0/C0;

    .line 8
    .line 9
    iget-object v0, v0, Lk0/C0;->a:Lx0/x$b;

    .line 10
    .line 11
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 12
    .line 13
    iget-wide v3, v1, Lk0/U0;->s:J

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v1, p0

    .line 18
    move-object v2, v0

    .line 19
    invoke-virtual/range {v1 .. v6}, Lk0/t0;->O0(Lx0/x$b;JZZ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 24
    .line 25
    iget-wide v1, v1, Lk0/U0;->s:J

    .line 26
    .line 27
    cmp-long v1, v3, v1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 32
    .line 33
    iget-wide v5, v1, Lk0/U0;->c:J

    .line 34
    .line 35
    iget-wide v7, v1, Lk0/U0;->d:J

    .line 36
    .line 37
    const/4 v10, 0x5

    .line 38
    move-object v1, p0

    .line 39
    move-object v2, v0

    .line 40
    move v9, p1

    .line 41
    invoke-virtual/range {v1 .. v10}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lk0/t0;->N:Lk0/U0;

    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public final M(Ljava/io/IOException;I)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lk0/u;->c(Ljava/io/IOException;I)Lk0/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lk0/t0;->G:Lk0/E0;

    .line 6
    .line 7
    invoke-virtual {p2}, Lk0/E0;->t()Lk0/B0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget-object p2, p2, Lk0/B0;->f:Lk0/C0;

    .line 14
    .line 15
    iget-object p2, p2, Lk0/C0;->a:Lx0/x$b;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lk0/u;->a(Lx0/x$b;)Lk0/u;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    const-string p2, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string v0, "Playback error"

    .line 24
    .line 25
    invoke-static {p2, v0, p1}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p0, p2, p2}, Lk0/t0;->t1(ZZ)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lk0/t0;->N:Lk0/U0;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Lk0/U0;->f(Lk0/u;)Lk0/U0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lk0/t0;->N:Lk0/U0;

    .line 39
    .line 40
    return-void
.end method

.method public final M0(Lk0/t0$h;)V
    .locals 18

    .line 1
    move-object/from16 v11, p0

    move-object/from16 v0, p1

    iget-object v1, v11, Lk0/t0;->O:Lk0/t0$e;

    const/4 v8, 0x1

    invoke-virtual {v1, v8}, Lk0/t0$e;->b(I)V

    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    iget-object v1, v1, Lk0/U0;->a:Ld0/I;

    iget v4, v11, Lk0/t0;->V:I

    iget-boolean v5, v11, Lk0/t0;->W:Z

    iget-object v6, v11, Lk0/t0;->y:Ld0/I$c;

    iget-object v7, v11, Lk0/t0;->z:Ld0/I$b;

    const/4 v3, 0x1

    move-object/from16 v2, p1

    invoke-static/range {v1 .. v7}, Lk0/t0;->H0(Ld0/I;Lk0/t0$h;ZIZLd0/I$c;Ld0/I$b;)Landroid/util/Pair;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, 0x0

    if-nez v1, :cond_0

    iget-object v7, v11, Lk0/t0;->N:Lk0/U0;

    iget-object v7, v7, Lk0/U0;->a:Ld0/I;

    invoke-virtual {v11, v7}, Lk0/t0;->H(Ld0/I;)Landroid/util/Pair;

    move-result-object v7

    iget-object v9, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lx0/x$b;

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-object v7, v11, Lk0/t0;->N:Lk0/U0;

    iget-object v7, v7, Lk0/U0;->a:Ld0/I;

    invoke-virtual {v7}, Ld0/I;->q()Z

    move-result v7

    xor-int/2addr v7, v8

    move v10, v7

    move-wide/from16 v16, v4

    :goto_0
    move-wide v4, v12

    move-wide/from16 v12, v16

    goto/16 :goto_4

    :cond_0
    iget-object v7, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v9, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-wide v9, v0, Lk0/t0$h;->c:J

    cmp-long v9, v9, v4

    if-nez v9, :cond_1

    move-wide v9, v4

    goto :goto_1

    :cond_1
    move-wide v9, v12

    :goto_1
    iget-object v14, v11, Lk0/t0;->G:Lk0/E0;

    iget-object v15, v11, Lk0/t0;->N:Lk0/U0;

    iget-object v15, v15, Lk0/U0;->a:Ld0/I;

    invoke-virtual {v14, v15, v7, v12, v13}, Lk0/E0;->L(Ld0/I;Ljava/lang/Object;J)Lx0/x$b;

    move-result-object v7

    invoke-virtual {v7}, Lx0/x$b;->b()Z

    move-result v14

    if-eqz v14, :cond_3

    iget-object v4, v11, Lk0/t0;->N:Lk0/U0;

    iget-object v4, v4, Lk0/U0;->a:Ld0/I;

    iget-object v5, v7, Lx0/x$b;->a:Ljava/lang/Object;

    iget-object v12, v11, Lk0/t0;->z:Ld0/I$b;

    invoke-virtual {v4, v5, v12}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    iget-object v4, v11, Lk0/t0;->z:Ld0/I$b;

    iget v5, v7, Lx0/x$b;->b:I

    invoke-virtual {v4, v5}, Ld0/I$b;->k(I)I

    move-result v4

    iget v5, v7, Lx0/x$b;->c:I

    if-ne v4, v5, :cond_2

    iget-object v4, v11, Lk0/t0;->z:Ld0/I$b;

    invoke-virtual {v4}, Ld0/I$b;->g()J

    move-result-wide v4

    move-wide v12, v4

    goto :goto_2

    :cond_2
    move-wide v12, v2

    :goto_2
    move-wide v4, v12

    move-wide v12, v9

    move-object v9, v7

    move v10, v8

    goto :goto_4

    :cond_3
    iget-wide v14, v0, Lk0/t0$h;->c:J

    cmp-long v4, v14, v4

    if-nez v4, :cond_4

    move v4, v8

    goto :goto_3

    :cond_4
    move v4, v6

    :goto_3
    move-wide/from16 v16, v9

    move v10, v4

    move-object v9, v7

    goto :goto_0

    :goto_4
    :try_start_0
    iget-object v7, v11, Lk0/t0;->N:Lk0/U0;

    iget-object v7, v7, Lk0/U0;->a:Ld0/I;

    invoke-virtual {v7}, Ld0/I;->q()Z

    move-result v7

    if-eqz v7, :cond_5

    iput-object v0, v11, Lk0/t0;->b0:Lk0/t0$h;

    goto :goto_5

    :catchall_0
    move-exception v0

    move-wide v7, v4

    goto/16 :goto_a

    :cond_5
    const/4 v0, 0x4

    if-nez v1, :cond_7

    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    iget v1, v1, Lk0/U0;->e:I

    if-eq v1, v8, :cond_6

    invoke-virtual {v11, v0}, Lk0/t0;->l1(I)V

    :cond_6
    invoke-virtual {v11, v6, v8, v6, v8}, Lk0/t0;->A0(ZZZZ)V

    :goto_5
    move-wide v7, v4

    goto/16 :goto_9

    :cond_7
    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    iget-object v1, v1, Lk0/U0;->b:Lx0/x$b;

    invoke-virtual {v9, v1}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, v11, Lk0/t0;->G:Lk0/E0;

    invoke-virtual {v1}, Lk0/E0;->t()Lk0/B0;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-boolean v7, v1, Lk0/B0;->d:Z

    if-eqz v7, :cond_8

    cmp-long v2, v4, v2

    if-eqz v2, :cond_8

    iget-object v1, v1, Lk0/B0;->a:Lx0/v;

    iget-object v2, v11, Lk0/t0;->M:Lk0/d1;

    invoke-interface {v1, v4, v5, v2}, Lx0/v;->d(JLk0/d1;)J

    move-result-wide v1

    goto :goto_6

    :cond_8
    move-wide v1, v4

    :goto_6
    invoke-static {v1, v2}, Lg0/M;->i1(J)J

    move-result-wide v14

    iget-object v3, v11, Lk0/t0;->N:Lk0/U0;

    iget-wide v6, v3, Lk0/U0;->s:J

    invoke-static {v6, v7}, Lg0/M;->i1(J)J

    move-result-wide v6

    cmp-long v3, v14, v6

    if-nez v3, :cond_b

    iget-object v3, v11, Lk0/t0;->N:Lk0/U0;

    iget v6, v3, Lk0/U0;->e:I

    const/4 v7, 0x2

    if-eq v6, v7, :cond_9

    const/4 v7, 0x3

    if-ne v6, v7, :cond_b

    :cond_9
    iget-wide v7, v3, Lk0/U0;->s:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x2

    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v7

    move-wide v5, v12

    move v9, v10

    move v10, v0

    invoke-virtual/range {v1 .. v10}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    move-result-object v0

    iput-object v0, v11, Lk0/t0;->N:Lk0/U0;

    return-void

    :cond_a
    move-wide v1, v4

    :cond_b
    :try_start_1
    iget-object v3, v11, Lk0/t0;->N:Lk0/U0;

    iget v3, v3, Lk0/U0;->e:I

    if-ne v3, v0, :cond_c

    move v0, v8

    goto :goto_7

    :cond_c
    const/4 v0, 0x0

    :goto_7
    invoke-virtual {v11, v9, v1, v2, v0}, Lk0/t0;->N0(Lx0/x$b;JZ)J

    move-result-wide v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v0, v4, v14

    if-eqz v0, :cond_d

    goto :goto_8

    :cond_d
    const/4 v8, 0x0

    :goto_8
    or-int/2addr v10, v8

    :try_start_2
    iget-object v0, v11, Lk0/t0;->N:Lk0/U0;

    iget-object v4, v0, Lk0/U0;->a:Ld0/I;

    iget-object v5, v0, Lk0/U0;->b:Lx0/x$b;

    const/4 v8, 0x1

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v3, v9

    move-wide v6, v12

    invoke-virtual/range {v1 .. v8}, Lk0/t0;->A1(Ld0/I;Lx0/x$b;Ld0/I;Lx0/x$b;JZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-wide v7, v14

    :goto_9
    const/4 v0, 0x2

    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v7

    move-wide v5, v12

    move v9, v10

    move v10, v0

    invoke-virtual/range {v1 .. v10}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    move-result-object v0

    iput-object v0, v11, Lk0/t0;->N:Lk0/U0;

    return-void

    :catchall_1
    move-exception v0

    move-wide v7, v14

    :goto_a
    const/4 v14, 0x2

    move-object/from16 v1, p0

    move-object v2, v9

    move-wide v3, v7

    move-wide v5, v12

    move v9, v10

    move v10, v14

    invoke-virtual/range {v1 .. v10}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    move-result-object v1

    iput-object v1, v11, Lk0/t0;->N:Lk0/U0;

    throw v0
.end method

.method public final N(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->m()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 10
    .line 11
    iget-object v1, v1, Lk0/U0;->b:Lx0/x$b;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, v0, Lk0/B0;->f:Lk0/C0;

    .line 15
    .line 16
    iget-object v1, v1, Lk0/C0;->a:Lx0/x$b;

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Lk0/t0;->N:Lk0/U0;

    .line 19
    .line 20
    iget-object v2, v2, Lk0/U0;->k:Lx0/x$b;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    xor-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v3, p0, Lk0/t0;->N:Lk0/U0;

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Lk0/U0;->c(Lx0/x$b;)Lk0/U0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 37
    .line 38
    :cond_1
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    iget-wide v3, v1, Lk0/U0;->s:J

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-virtual {v0}, Lk0/B0;->j()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    :goto_1
    iput-wide v3, v1, Lk0/U0;->q:J

    .line 50
    .line 51
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 52
    .line 53
    invoke-virtual {p0}, Lk0/t0;->J()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    iput-wide v3, v1, Lk0/U0;->r:J

    .line 58
    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    :cond_3
    if-eqz v0, :cond_4

    .line 64
    .line 65
    iget-boolean p1, v0, Lk0/B0;->d:Z

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    iget-object p1, v0, Lk0/B0;->f:Lk0/C0;

    .line 70
    .line 71
    iget-object p1, p1, Lk0/C0;->a:Lx0/x$b;

    .line 72
    .line 73
    invoke-virtual {v0}, Lk0/B0;->o()Lx0/Z;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0}, Lk0/B0;->p()LA0/E;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p0, p1, v1, v0}, Lk0/t0;->w1(Lx0/x$b;Lx0/Z;LA0/E;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    return-void
.end method

.method public final N0(Lx0/x$b;JZ)J
    .locals 7

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lk0/t0;->G:Lk0/E0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lk0/E0;->u()Lk0/B0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :goto_0
    move v5, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move-wide v3, p2

    .line 23
    move v6, p4

    .line 24
    invoke-virtual/range {v1 .. v6}, Lk0/t0;->O0(Lx0/x$b;JZZ)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method public final O(Ld0/I;Z)V
    .locals 27

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    iget-object v2, v11, Lk0/t0;->N:Lk0/U0;

    .line 6
    .line 7
    iget-object v3, v11, Lk0/t0;->b0:Lk0/t0$h;

    .line 8
    .line 9
    iget-object v4, v11, Lk0/t0;->G:Lk0/E0;

    .line 10
    .line 11
    iget v5, v11, Lk0/t0;->V:I

    .line 12
    .line 13
    iget-boolean v6, v11, Lk0/t0;->W:Z

    .line 14
    .line 15
    iget-object v7, v11, Lk0/t0;->y:Ld0/I$c;

    .line 16
    .line 17
    iget-object v8, v11, Lk0/t0;->z:Ld0/I$b;

    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    invoke-static/range {v1 .. v8}, Lk0/t0;->G0(Ld0/I;Lk0/U0;Lk0/t0$h;Lk0/E0;IZLd0/I$c;Ld0/I$b;)Lk0/t0$g;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    iget-object v9, v7, Lk0/t0$g;->a:Lx0/x$b;

    .line 26
    .line 27
    iget-wide v13, v7, Lk0/t0$g;->c:J

    .line 28
    .line 29
    iget-boolean v0, v7, Lk0/t0$g;->d:Z

    .line 30
    .line 31
    iget-wide v5, v7, Lk0/t0$g;->b:J

    .line 32
    .line 33
    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 34
    .line 35
    iget-object v1, v1, Lk0/U0;->b:Lx0/x$b;

    .line 36
    .line 37
    invoke-virtual {v1, v9}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v10, 0x1

    .line 42
    const/4 v15, 0x0

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 46
    .line 47
    iget-wide v1, v1, Lk0/U0;->s:J

    .line 48
    .line 49
    cmp-long v1, v5, v1

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move/from16 v16, v15

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    :goto_0
    move/from16 v16, v10

    .line 58
    .line 59
    :goto_1
    const/4 v8, 0x2

    .line 60
    const/16 v17, 0x3

    .line 61
    .line 62
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    const/4 v2, 0x4

    .line 68
    :try_start_0
    iget-boolean v1, v7, Lk0/t0$g;->e:Z

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 73
    .line 74
    iget v1, v1, Lk0/U0;->e:I

    .line 75
    .line 76
    if-eq v1, v10, :cond_2

    .line 77
    .line 78
    invoke-virtual {v11, v2}, Lk0/t0;->l1(I)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    move/from16 v20, v2

    .line 84
    .line 85
    move v4, v8

    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v10, -0x1

    .line 88
    goto/16 :goto_c

    .line 89
    .line 90
    :cond_2
    :goto_2
    invoke-virtual {v11, v15, v15, v15, v10}, Lk0/t0;->A0(ZZZZ)V

    .line 91
    .line 92
    .line 93
    :cond_3
    iget-object v1, v11, Lk0/t0;->o:[Lk0/Y0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    .line 95
    :try_start_1
    array-length v2, v1

    .line 96
    move v3, v15

    .line 97
    :goto_3
    if-ge v3, v2, :cond_4

    .line 98
    .line 99
    aget-object v4, v1, v3

    .line 100
    .line 101
    invoke-interface {v4, v12}, Lk0/Y0;->E(Ld0/I;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    .line 103
    .line 104
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    move v4, v8

    .line 109
    const/4 v8, 0x0

    .line 110
    const/4 v10, -0x1

    .line 111
    const/16 v20, 0x4

    .line 112
    .line 113
    goto/16 :goto_c

    .line 114
    .line 115
    :cond_4
    if-nez v16, :cond_6

    .line 116
    .line 117
    :try_start_2
    iget-object v1, v11, Lk0/t0;->G:Lk0/E0;

    .line 118
    .line 119
    iget-wide v3, v11, Lk0/t0;->c0:J

    .line 120
    .line 121
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->G()J

    .line 122
    .line 123
    .line 124
    move-result-wide v23
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 125
    const/16 v20, 0x4

    .line 126
    .line 127
    move-object/from16 v2, p1

    .line 128
    .line 129
    const/4 v10, -0x1

    .line 130
    move-wide/from16 v25, v5

    .line 131
    .line 132
    move-wide/from16 v5, v23

    .line 133
    .line 134
    :try_start_3
    invoke-virtual/range {v1 .. v6}, Lk0/E0;->R(Ld0/I;JJ)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_5

    .line 139
    .line 140
    invoke-virtual {v11, v15}, Lk0/t0;->L0(Z)V

    .line 141
    .line 142
    .line 143
    :cond_5
    move-wide/from16 v5, v25

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :catchall_2
    move-exception v0

    .line 147
    move v4, v8

    .line 148
    move-wide/from16 v5, v25

    .line 149
    .line 150
    :goto_4
    const/4 v8, 0x0

    .line 151
    goto/16 :goto_c

    .line 152
    .line 153
    :catchall_3
    move-exception v0

    .line 154
    move-wide/from16 v25, v5

    .line 155
    .line 156
    const/4 v10, -0x1

    .line 157
    const/16 v20, 0x4

    .line 158
    .line 159
    :goto_5
    move v4, v8

    .line 160
    goto :goto_4

    .line 161
    :cond_6
    move-wide/from16 v25, v5

    .line 162
    .line 163
    const/4 v10, -0x1

    .line 164
    const/16 v20, 0x4

    .line 165
    .line 166
    invoke-virtual/range {p1 .. p1}, Ld0/I;->q()Z

    .line 167
    .line 168
    .line 169
    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 170
    if-nez v1, :cond_5

    .line 171
    .line 172
    :try_start_4
    iget-object v1, v11, Lk0/t0;->G:Lk0/E0;

    .line 173
    .line 174
    invoke-virtual {v1}, Lk0/E0;->t()Lk0/B0;

    .line 175
    .line 176
    .line 177
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 178
    :goto_6
    if-eqz v1, :cond_8

    .line 179
    .line 180
    :try_start_5
    iget-object v2, v1, Lk0/B0;->f:Lk0/C0;

    .line 181
    .line 182
    iget-object v2, v2, Lk0/C0;->a:Lx0/x$b;

    .line 183
    .line 184
    invoke-virtual {v2, v9}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_7

    .line 189
    .line 190
    iget-object v2, v11, Lk0/t0;->G:Lk0/E0;

    .line 191
    .line 192
    iget-object v3, v1, Lk0/B0;->f:Lk0/C0;

    .line 193
    .line 194
    invoke-virtual {v2, v12, v3}, Lk0/E0;->v(Ld0/I;Lk0/C0;)Lk0/C0;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    iput-object v2, v1, Lk0/B0;->f:Lk0/C0;

    .line 199
    .line 200
    invoke-virtual {v1}, Lk0/B0;->C()V

    .line 201
    .line 202
    .line 203
    :cond_7
    invoke-virtual {v1}, Lk0/B0;->k()Lk0/B0;

    .line 204
    .line 205
    .line 206
    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 207
    goto :goto_6

    .line 208
    :cond_8
    move-wide/from16 v5, v25

    .line 209
    .line 210
    :try_start_6
    invoke-virtual {v11, v9, v5, v6, v0}, Lk0/t0;->N0(Lx0/x$b;JZ)J

    .line 211
    .line 212
    .line 213
    move-result-wide v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 214
    move-wide/from16 v22, v0

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :catchall_4
    move-exception v0

    .line 218
    goto :goto_5

    .line 219
    :catchall_5
    move-exception v0

    .line 220
    move-wide/from16 v5, v25

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :goto_7
    move-wide/from16 v22, v5

    .line 224
    .line 225
    :goto_8
    iget-object v0, v11, Lk0/t0;->N:Lk0/U0;

    .line 226
    .line 227
    iget-object v4, v0, Lk0/U0;->a:Ld0/I;

    .line 228
    .line 229
    iget-object v5, v0, Lk0/U0;->b:Lx0/x$b;

    .line 230
    .line 231
    iget-boolean v0, v7, Lk0/t0$g;->f:Z

    .line 232
    .line 233
    if-eqz v0, :cond_9

    .line 234
    .line 235
    move-wide/from16 v6, v22

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_9
    move-wide/from16 v6, v18

    .line 239
    .line 240
    :goto_9
    const/4 v0, 0x0

    .line 241
    move-object/from16 v1, p0

    .line 242
    .line 243
    move-object/from16 v2, p1

    .line 244
    .line 245
    move-object v3, v9

    .line 246
    move v8, v0

    .line 247
    invoke-virtual/range {v1 .. v8}, Lk0/t0;->A1(Ld0/I;Lx0/x$b;Ld0/I;Lx0/x$b;JZ)V

    .line 248
    .line 249
    .line 250
    if-nez v16, :cond_a

    .line 251
    .line 252
    iget-object v0, v11, Lk0/t0;->N:Lk0/U0;

    .line 253
    .line 254
    iget-wide v0, v0, Lk0/U0;->c:J

    .line 255
    .line 256
    cmp-long v0, v13, v0

    .line 257
    .line 258
    if-eqz v0, :cond_d

    .line 259
    .line 260
    :cond_a
    iget-object v0, v11, Lk0/t0;->N:Lk0/U0;

    .line 261
    .line 262
    iget-object v1, v0, Lk0/U0;->b:Lx0/x$b;

    .line 263
    .line 264
    iget-object v1, v1, Lx0/x$b;->a:Ljava/lang/Object;

    .line 265
    .line 266
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 267
    .line 268
    if-eqz v16, :cond_b

    .line 269
    .line 270
    if-eqz p2, :cond_b

    .line 271
    .line 272
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-nez v2, :cond_b

    .line 277
    .line 278
    iget-object v2, v11, Lk0/t0;->z:Ld0/I$b;

    .line 279
    .line 280
    invoke-virtual {v0, v1, v2}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    iget-boolean v0, v0, Ld0/I$b;->f:Z

    .line 285
    .line 286
    if-nez v0, :cond_b

    .line 287
    .line 288
    const/16 v21, 0x1

    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_b
    move/from16 v21, v15

    .line 292
    .line 293
    :goto_a
    iget-object v0, v11, Lk0/t0;->N:Lk0/U0;

    .line 294
    .line 295
    iget-wide v7, v0, Lk0/U0;->d:J

    .line 296
    .line 297
    invoke-virtual {v12, v1}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-ne v0, v10, :cond_c

    .line 302
    .line 303
    move/from16 v10, v20

    .line 304
    .line 305
    goto :goto_b

    .line 306
    :cond_c
    move/from16 v10, v17

    .line 307
    .line 308
    :goto_b
    move-object/from16 v1, p0

    .line 309
    .line 310
    move-object v2, v9

    .line 311
    move-wide/from16 v3, v22

    .line 312
    .line 313
    move-wide v5, v13

    .line 314
    move/from16 v9, v21

    .line 315
    .line 316
    invoke-virtual/range {v1 .. v10}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iput-object v0, v11, Lk0/t0;->N:Lk0/U0;

    .line 321
    .line 322
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->B0()V

    .line 323
    .line 324
    .line 325
    iget-object v0, v11, Lk0/t0;->N:Lk0/U0;

    .line 326
    .line 327
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 328
    .line 329
    invoke-virtual {v11, v12, v0}, Lk0/t0;->F0(Ld0/I;Ld0/I;)V

    .line 330
    .line 331
    .line 332
    iget-object v0, v11, Lk0/t0;->N:Lk0/U0;

    .line 333
    .line 334
    invoke-virtual {v0, v12}, Lk0/U0;->j(Ld0/I;)Lk0/U0;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    iput-object v0, v11, Lk0/t0;->N:Lk0/U0;

    .line 339
    .line 340
    invoke-virtual/range {p1 .. p1}, Ld0/I;->q()Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_e

    .line 345
    .line 346
    const/4 v8, 0x0

    .line 347
    iput-object v8, v11, Lk0/t0;->b0:Lk0/t0$h;

    .line 348
    .line 349
    :cond_e
    invoke-virtual {v11, v15}, Lk0/t0;->N(Z)V

    .line 350
    .line 351
    .line 352
    iget-object v0, v11, Lk0/t0;->v:Lg0/k;

    .line 353
    .line 354
    const/4 v4, 0x2

    .line 355
    invoke-interface {v0, v4}, Lg0/k;->c(I)Z

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :goto_c
    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 360
    .line 361
    iget-object v3, v1, Lk0/U0;->a:Ld0/I;

    .line 362
    .line 363
    iget-object v2, v1, Lk0/U0;->b:Lx0/x$b;

    .line 364
    .line 365
    iget-boolean v1, v7, Lk0/t0$g;->f:Z

    .line 366
    .line 367
    if-eqz v1, :cond_f

    .line 368
    .line 369
    move-wide/from16 v18, v5

    .line 370
    .line 371
    :cond_f
    const/16 v22, 0x0

    .line 372
    .line 373
    move-object/from16 v1, p0

    .line 374
    .line 375
    move-object v7, v2

    .line 376
    move-object/from16 v2, p1

    .line 377
    .line 378
    move-object/from16 v23, v3

    .line 379
    .line 380
    move-object v3, v9

    .line 381
    move-object/from16 v4, v23

    .line 382
    .line 383
    move-wide/from16 v23, v5

    .line 384
    .line 385
    move-object v5, v7

    .line 386
    move-wide/from16 v6, v18

    .line 387
    .line 388
    move-object v15, v8

    .line 389
    move/from16 v8, v22

    .line 390
    .line 391
    invoke-virtual/range {v1 .. v8}, Lk0/t0;->A1(Ld0/I;Lx0/x$b;Ld0/I;Lx0/x$b;JZ)V

    .line 392
    .line 393
    .line 394
    if-nez v16, :cond_10

    .line 395
    .line 396
    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 397
    .line 398
    iget-wide v1, v1, Lk0/U0;->c:J

    .line 399
    .line 400
    cmp-long v1, v13, v1

    .line 401
    .line 402
    if-eqz v1, :cond_13

    .line 403
    .line 404
    :cond_10
    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 405
    .line 406
    iget-object v2, v1, Lk0/U0;->b:Lx0/x$b;

    .line 407
    .line 408
    iget-object v2, v2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 409
    .line 410
    iget-object v1, v1, Lk0/U0;->a:Ld0/I;

    .line 411
    .line 412
    if-eqz v16, :cond_11

    .line 413
    .line 414
    if-eqz p2, :cond_11

    .line 415
    .line 416
    invoke-virtual {v1}, Ld0/I;->q()Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-nez v3, :cond_11

    .line 421
    .line 422
    iget-object v3, v11, Lk0/t0;->z:Ld0/I$b;

    .line 423
    .line 424
    invoke-virtual {v1, v2, v3}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    iget-boolean v1, v1, Ld0/I$b;->f:Z

    .line 429
    .line 430
    if-nez v1, :cond_11

    .line 431
    .line 432
    const/16 v21, 0x1

    .line 433
    .line 434
    goto :goto_d

    .line 435
    :cond_11
    const/16 v21, 0x0

    .line 436
    .line 437
    :goto_d
    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 438
    .line 439
    iget-wide v7, v1, Lk0/U0;->d:J

    .line 440
    .line 441
    invoke-virtual {v12, v2}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    if-ne v1, v10, :cond_12

    .line 446
    .line 447
    move/from16 v10, v20

    .line 448
    .line 449
    goto :goto_e

    .line 450
    :cond_12
    move/from16 v10, v17

    .line 451
    .line 452
    :goto_e
    move-object/from16 v1, p0

    .line 453
    .line 454
    move-object v2, v9

    .line 455
    move-wide/from16 v3, v23

    .line 456
    .line 457
    move-wide v5, v13

    .line 458
    move/from16 v9, v21

    .line 459
    .line 460
    invoke-virtual/range {v1 .. v10}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    iput-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 465
    .line 466
    :cond_13
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->B0()V

    .line 467
    .line 468
    .line 469
    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 470
    .line 471
    iget-object v1, v1, Lk0/U0;->a:Ld0/I;

    .line 472
    .line 473
    invoke-virtual {v11, v12, v1}, Lk0/t0;->F0(Ld0/I;Ld0/I;)V

    .line 474
    .line 475
    .line 476
    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 477
    .line 478
    invoke-virtual {v1, v12}, Lk0/U0;->j(Ld0/I;)Lk0/U0;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    iput-object v1, v11, Lk0/t0;->N:Lk0/U0;

    .line 483
    .line 484
    invoke-virtual/range {p1 .. p1}, Ld0/I;->q()Z

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    if-nez v1, :cond_14

    .line 489
    .line 490
    iput-object v15, v11, Lk0/t0;->b0:Lk0/t0$h;

    .line 491
    .line 492
    :cond_14
    const/4 v1, 0x0

    .line 493
    invoke-virtual {v11, v1}, Lk0/t0;->N(Z)V

    .line 494
    .line 495
    .line 496
    iget-object v1, v11, Lk0/t0;->v:Lg0/k;

    .line 497
    .line 498
    const/4 v2, 0x2

    .line 499
    invoke-interface {v1, v2}, Lg0/k;->c(I)Z

    .line 500
    .line 501
    .line 502
    throw v0
.end method

.method public final O0(Lx0/x$b;JZZ)J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lk0/t0;->u1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1, v0}, Lk0/t0;->B1(ZZ)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    if-nez p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, Lk0/t0;->N:Lk0/U0;

    .line 13
    .line 14
    iget p5, p5, Lk0/U0;->e:I

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    if-ne p5, v2, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, v0}, Lk0/t0;->l1(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p5, p0, Lk0/t0;->G:Lk0/E0;

    .line 23
    .line 24
    invoke-virtual {p5}, Lk0/E0;->t()Lk0/B0;

    .line 25
    .line 26
    .line 27
    move-result-object p5

    .line 28
    move-object v2, p5

    .line 29
    :goto_0
    if-eqz v2, :cond_3

    .line 30
    .line 31
    iget-object v3, v2, Lk0/B0;->f:Lk0/C0;

    .line 32
    .line 33
    iget-object v3, v3, Lk0/C0;->a:Lx0/x$b;

    .line 34
    .line 35
    invoke-virtual {p1, v3}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {v2}, Lk0/B0;->k()Lk0/B0;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    :goto_1
    if-nez p4, :cond_4

    .line 48
    .line 49
    if-ne p5, v2, :cond_4

    .line 50
    .line 51
    if-eqz v2, :cond_7

    .line 52
    .line 53
    invoke-virtual {v2, p2, p3}, Lk0/B0;->B(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p4

    .line 57
    const-wide/16 v3, 0x0

    .line 58
    .line 59
    cmp-long p1, p4, v3

    .line 60
    .line 61
    if-gez p1, :cond_7

    .line 62
    .line 63
    :cond_4
    iget-object p1, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 64
    .line 65
    array-length p4, p1

    .line 66
    move p5, v1

    .line 67
    :goto_2
    if-ge p5, p4, :cond_5

    .line 68
    .line 69
    aget-object v3, p1, p5

    .line 70
    .line 71
    invoke-virtual {p0, v3}, Lk0/t0;->v(Lk0/Y0;)V

    .line 72
    .line 73
    .line 74
    add-int/lit8 p5, p5, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    if-eqz v2, :cond_7

    .line 78
    .line 79
    :goto_3
    iget-object p1, p0, Lk0/t0;->G:Lk0/E0;

    .line 80
    .line 81
    invoke-virtual {p1}, Lk0/E0;->t()Lk0/B0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eq p1, v2, :cond_6

    .line 86
    .line 87
    iget-object p1, p0, Lk0/t0;->G:Lk0/E0;

    .line 88
    .line 89
    invoke-virtual {p1}, Lk0/E0;->b()Lk0/B0;

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_6
    iget-object p1, p0, Lk0/t0;->G:Lk0/E0;

    .line 94
    .line 95
    invoke-virtual {p1, v2}, Lk0/E0;->I(Lk0/B0;)Z

    .line 96
    .line 97
    .line 98
    const-wide p4, 0xe8d4a51000L

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, p4, p5}, Lk0/B0;->z(J)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lk0/t0;->y()V

    .line 107
    .line 108
    .line 109
    :cond_7
    iget-object p1, p0, Lk0/t0;->G:Lk0/E0;

    .line 110
    .line 111
    if-eqz v2, :cond_a

    .line 112
    .line 113
    invoke-virtual {p1, v2}, Lk0/E0;->I(Lk0/B0;)Z

    .line 114
    .line 115
    .line 116
    iget-boolean p1, v2, Lk0/B0;->d:Z

    .line 117
    .line 118
    if-nez p1, :cond_8

    .line 119
    .line 120
    iget-object p1, v2, Lk0/B0;->f:Lk0/C0;

    .line 121
    .line 122
    invoke-virtual {p1, p2, p3}, Lk0/C0;->b(J)Lk0/C0;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, v2, Lk0/B0;->f:Lk0/C0;

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_8
    iget-boolean p1, v2, Lk0/B0;->e:Z

    .line 130
    .line 131
    if-eqz p1, :cond_9

    .line 132
    .line 133
    iget-object p1, v2, Lk0/B0;->a:Lx0/v;

    .line 134
    .line 135
    invoke-interface {p1, p2, p3}, Lx0/v;->s(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide p2

    .line 139
    iget-object p1, v2, Lk0/B0;->a:Lx0/v;

    .line 140
    .line 141
    iget-wide p4, p0, Lk0/t0;->A:J

    .line 142
    .line 143
    sub-long p4, p2, p4

    .line 144
    .line 145
    iget-boolean v2, p0, Lk0/t0;->B:Z

    .line 146
    .line 147
    invoke-interface {p1, p4, p5, v2}, Lx0/v;->q(JZ)V

    .line 148
    .line 149
    .line 150
    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, Lk0/t0;->C0(J)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lk0/t0;->c0()V

    .line 154
    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_a
    invoke-virtual {p1}, Lk0/E0;->f()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p2, p3}, Lk0/t0;->C0(J)V

    .line 161
    .line 162
    .line 163
    :goto_5
    invoke-virtual {p0, v1}, Lk0/t0;->N(Z)V

    .line 164
    .line 165
    .line 166
    iget-object p1, p0, Lk0/t0;->v:Lg0/k;

    .line 167
    .line 168
    invoke-interface {p1, v0}, Lg0/k;->c(I)Z

    .line 169
    .line 170
    .line 171
    return-wide p2
.end method

.method public final P(Lx0/v;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk0/E0;->B(Lx0/v;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lk0/t0;->G:Lk0/E0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lk0/E0;->m()Lk0/B0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lk0/t0;->C:Lk0/s;

    .line 17
    .line 18
    invoke-virtual {v0}, Lk0/s;->h()Ld0/C;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v0, v0, Ld0/C;->a:F

    .line 23
    .line 24
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 25
    .line 26
    iget-object v1, v1, Lk0/U0;->a:Ld0/I;

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Lk0/B0;->q(FLd0/I;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p1, Lk0/B0;->f:Lk0/C0;

    .line 32
    .line 33
    iget-object v0, v0, Lk0/C0;->a:Lx0/x$b;

    .line 34
    .line 35
    invoke-virtual {p1}, Lk0/B0;->o()Lx0/Z;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1}, Lk0/B0;->p()LA0/E;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p0, v0, v1, v2}, Lk0/t0;->w1(Lx0/x$b;Lx0/Z;LA0/E;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 47
    .line 48
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne p1, v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p1, Lk0/B0;->f:Lk0/C0;

    .line 55
    .line 56
    iget-wide v0, v0, Lk0/C0;->b:J

    .line 57
    .line 58
    invoke-virtual {p0, v0, v1}, Lk0/t0;->C0(J)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lk0/t0;->y()V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 65
    .line 66
    iget-object v2, v0, Lk0/U0;->b:Lx0/x$b;

    .line 67
    .line 68
    iget-object p1, p1, Lk0/B0;->f:Lk0/C0;

    .line 69
    .line 70
    iget-wide v7, p1, Lk0/C0;->b:J

    .line 71
    .line 72
    iget-wide v5, v0, Lk0/U0;->c:J

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x5

    .line 76
    move-object v1, p0

    .line 77
    move-wide v3, v7

    .line 78
    invoke-virtual/range {v1 .. v10}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, Lk0/t0;->N:Lk0/U0;

    .line 83
    .line 84
    :cond_1
    invoke-virtual {p0}, Lk0/t0;->c0()V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final P0(Lk0/V0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lk0/V0;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lk0/t0;->Q0(Lk0/V0;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 19
    .line 20
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 21
    .line 22
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v1, Lk0/t0$d;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Lk0/t0$d;-><init>(Lk0/V0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v0, Lk0/t0$d;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Lk0/t0$d;-><init>(Lk0/V0;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 45
    .line 46
    iget-object v4, v1, Lk0/U0;->a:Ld0/I;

    .line 47
    .line 48
    iget v5, p0, Lk0/t0;->V:I

    .line 49
    .line 50
    iget-boolean v6, p0, Lk0/t0;->W:Z

    .line 51
    .line 52
    iget-object v7, p0, Lk0/t0;->y:Ld0/I$c;

    .line 53
    .line 54
    iget-object v8, p0, Lk0/t0;->z:Ld0/I$b;

    .line 55
    .line 56
    move-object v2, v0

    .line 57
    move-object v3, v4

    .line 58
    invoke-static/range {v2 .. v8}, Lk0/t0;->E0(Lk0/t0$d;Ld0/I;Ld0/I;IZLd0/I$c;Ld0/I$b;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    iget-object p1, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v0, 0x0

    .line 76
    invoke-virtual {p1, v0}, Lk0/V0;->k(Z)V

    .line 77
    .line 78
    .line 79
    :goto_0
    return-void
.end method

.method public final Q(Ld0/C;FZZ)V
    .locals 3

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, Lk0/t0$e;->b(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, Lk0/t0;->N:Lk0/U0;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Lk0/U0;->g(Ld0/C;)Lk0/U0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, Lk0/t0;->N:Lk0/U0;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, Ld0/C;->a:F

    .line 20
    .line 21
    invoke-virtual {p0, p3}, Lk0/t0;->C1(F)V

    .line 22
    .line 23
    .line 24
    iget-object p3, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 25
    .line 26
    array-length p4, p3

    .line 27
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-ge v0, p4, :cond_3

    .line 29
    .line 30
    aget-object v1, p3, v0

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget v2, p1, Ld0/C;->a:F

    .line 35
    .line 36
    invoke-interface {v1, p2, v2}, Lk0/Y0;->I(FF)V

    .line 37
    .line 38
    .line 39
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    return-void
.end method

.method public final Q0(Lk0/V0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lk0/V0;->c()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lk0/t0;->x:Landroid/os/Looper;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lk0/t0;->u(Lk0/V0;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lk0/t0;->N:Lk0/U0;

    .line 13
    .line 14
    iget p1, p1, Lk0/U0;->e:I

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    .line 20
    if-ne p1, v1, :cond_2

    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lk0/t0;->v:Lg0/k;

    .line 23
    .line 24
    invoke-interface {p1, v1}, Lg0/k;->c(I)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 29
    .line 30
    const/16 v1, 0xf

    .line 31
    .line 32
    invoke-interface {v0, v1, p1}, Lg0/k;->g(ILjava/lang/Object;)Lg0/k$a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {p1}, Lg0/k$a;->a()V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void
.end method

.method public final R(Ld0/C;Z)V
    .locals 2

    .line 1
    iget v0, p1, Ld0/C;->a:F

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, p1, v0, v1, p2}, Lk0/t0;->Q(Ld0/C;FZZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final R0(Lk0/V0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lk0/V0;->c()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v0, "TAG"

    .line 16
    .line 17
    const-string v1, "Trying to send message on a dead thread."

    .line 18
    .line 19
    invoke-static {v0, v1}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Lk0/V0;->k(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v1, p0, Lk0/t0;->E:Lg0/c;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {v1, v0, v2}, Lg0/c;->e(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lg0/k;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lk0/r0;

    .line 35
    .line 36
    invoke-direct {v1, p0, p1}, Lk0/r0;-><init>(Lk0/t0;Lk0/V0;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v1}, Lg0/k;->j(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final S(Lx0/x$b;JJJZI)Lk0/U0;
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    move-object v2, p1

    .line 3
    move-wide/from16 v5, p4

    .line 4
    .line 5
    iget-boolean v1, v0, Lk0/t0;->f0:Z

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lk0/t0;->N:Lk0/U0;

    .line 10
    .line 11
    iget-wide v3, v1, Lk0/U0;->s:J

    .line 12
    .line 13
    cmp-long v1, p2, v3

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v1, v0, Lk0/t0;->N:Lk0/U0;

    .line 18
    .line 19
    iget-object v1, v1, Lk0/U0;->b:Lx0/x$b;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 31
    :goto_1
    iput-boolean v1, v0, Lk0/t0;->f0:Z

    .line 32
    .line 33
    invoke-virtual {p0}, Lk0/t0;->B0()V

    .line 34
    .line 35
    .line 36
    iget-object v1, v0, Lk0/t0;->N:Lk0/U0;

    .line 37
    .line 38
    iget-object v3, v1, Lk0/U0;->h:Lx0/Z;

    .line 39
    .line 40
    iget-object v4, v1, Lk0/U0;->i:LA0/E;

    .line 41
    .line 42
    iget-object v1, v1, Lk0/U0;->j:Ljava/util/List;

    .line 43
    .line 44
    iget-object v7, v0, Lk0/t0;->H:Lk0/T0;

    .line 45
    .line 46
    invoke-virtual {v7}, Lk0/T0;->t()Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_5

    .line 51
    .line 52
    iget-object v1, v0, Lk0/t0;->G:Lk0/E0;

    .line 53
    .line 54
    invoke-virtual {v1}, Lk0/E0;->t()Lk0/B0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    sget-object v3, Lx0/Z;->d:Lx0/Z;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    invoke-virtual {v1}, Lk0/B0;->o()Lx0/Z;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :goto_2
    if-nez v1, :cond_3

    .line 68
    .line 69
    iget-object v4, v0, Lk0/t0;->s:LA0/E;

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    invoke-virtual {v1}, Lk0/B0;->p()LA0/E;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    :goto_3
    iget-object v7, v4, LA0/E;->c:[LA0/y;

    .line 77
    .line 78
    invoke-virtual {p0, v7}, Lk0/t0;->C([LA0/y;)LX2/v;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    iget-object v8, v1, Lk0/B0;->f:Lk0/C0;

    .line 85
    .line 86
    iget-wide v9, v8, Lk0/C0;->c:J

    .line 87
    .line 88
    cmp-long v9, v9, v5

    .line 89
    .line 90
    if-eqz v9, :cond_4

    .line 91
    .line 92
    invoke-virtual {v8, v5, v6}, Lk0/C0;->a(J)Lk0/C0;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    iput-object v8, v1, Lk0/B0;->f:Lk0/C0;

    .line 97
    .line 98
    :cond_4
    invoke-virtual {p0}, Lk0/t0;->g0()V

    .line 99
    .line 100
    .line 101
    move-object v11, v3

    .line 102
    move-object v12, v4

    .line 103
    move-object v13, v7

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    iget-object v7, v0, Lk0/t0;->N:Lk0/U0;

    .line 106
    .line 107
    iget-object v7, v7, Lk0/U0;->b:Lx0/x$b;

    .line 108
    .line 109
    invoke-virtual {p1, v7}, Lx0/x$b;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-nez v7, :cond_6

    .line 114
    .line 115
    sget-object v1, Lx0/Z;->d:Lx0/Z;

    .line 116
    .line 117
    iget-object v3, v0, Lk0/t0;->s:LA0/E;

    .line 118
    .line 119
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    move-object v11, v1

    .line 124
    move-object v12, v3

    .line 125
    move-object v13, v4

    .line 126
    goto :goto_4

    .line 127
    :cond_6
    move-object v13, v1

    .line 128
    move-object v11, v3

    .line 129
    move-object v12, v4

    .line 130
    :goto_4
    if-eqz p8, :cond_7

    .line 131
    .line 132
    iget-object v1, v0, Lk0/t0;->O:Lk0/t0$e;

    .line 133
    .line 134
    move/from16 v3, p9

    .line 135
    .line 136
    invoke-virtual {v1, v3}, Lk0/t0$e;->d(I)V

    .line 137
    .line 138
    .line 139
    :cond_7
    iget-object v1, v0, Lk0/t0;->N:Lk0/U0;

    .line 140
    .line 141
    invoke-virtual {p0}, Lk0/t0;->J()J

    .line 142
    .line 143
    .line 144
    move-result-wide v9

    .line 145
    move-object v2, p1

    .line 146
    move-wide/from16 v3, p2

    .line 147
    .line 148
    move-wide/from16 v5, p4

    .line 149
    .line 150
    move-wide/from16 v7, p6

    .line 151
    .line 152
    invoke-virtual/range {v1 .. v13}, Lk0/U0;->d(Lx0/x$b;JJJJLx0/Z;LA0/E;Ljava/util/List;)Lk0/U0;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    return-object v1
.end method

.method public final S0(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-interface {v3}, Lk0/Y0;->i()Lx0/Q;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v3, p1, p2}, Lk0/t0;->T0(Lk0/Y0;J)V

    .line 16
    .line 17
    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return-void
.end method

.method public final T(Lk0/Y0;Lk0/B0;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Lk0/B0;->k()Lk0/B0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p2, p2, Lk0/B0;->f:Lk0/C0;

    .line 6
    .line 7
    iget-boolean p2, p2, Lk0/C0;->f:Z

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    iget-boolean p2, v0, Lk0/B0;->d:Z

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    instance-of p2, p1, Lz0/i;

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    instance-of p2, p1, Lu0/c;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Lk0/Y0;->w()J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    invoke-virtual {v0}, Lk0/B0;->n()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    cmp-long p1, p1, v0

    .line 32
    .line 33
    if-ltz p1, :cond_1

    .line 34
    .line 35
    :cond_0
    const/4 p1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    :goto_0
    return p1
.end method

.method public final T0(Lk0/Y0;J)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lk0/Y0;->u()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lz0/i;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, Lz0/i;

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, Lz0/i;->w0(J)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final U()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->u()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, v0, Lk0/B0;->d:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    move v1, v2

    .line 14
    :goto_0
    iget-object v3, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 15
    .line 16
    array-length v4, v3

    .line 17
    if-ge v1, v4, :cond_3

    .line 18
    .line 19
    aget-object v3, v3, v1

    .line 20
    .line 21
    iget-object v4, v0, Lk0/B0;->c:[Lx0/Q;

    .line 22
    .line 23
    aget-object v4, v4, v1

    .line 24
    .line 25
    invoke-interface {v3}, Lk0/Y0;->i()Lx0/Q;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    if-ne v5, v4, :cond_2

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-interface {v3}, Lk0/Y0;->p()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, v3, v0}, Lk0/t0;->T(Lk0/Y0;Lk0/B0;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    :goto_1
    return v2

    .line 50
    :cond_3
    const/4 v0, 0x1

    .line 51
    return v0
.end method

.method public final U0(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lk0/t0;->X:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lk0/t0;->X:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    invoke-static {v2}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Lk0/t0;->p:Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v2}, Lk0/Y0;->b()V

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz p2, :cond_2

    .line 38
    .line 39
    monitor-enter p0

    .line 40
    const/4 p1, 0x1

    .line 41
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p1

    .line 52
    :cond_2
    :goto_1
    return-void
.end method

.method public final V0(Ld0/C;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lg0/k;->f(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lk0/t0;->C:Lk0/s;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lk0/s;->k(Ld0/C;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final W()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->m()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-virtual {v0}, Lk0/B0;->r()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    invoke-virtual {v0}, Lk0/B0;->l()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide/high16 v4, -0x8000000000000000L

    .line 23
    .line 24
    cmp-long v0, v2, v4

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    const/4 v0, 0x1

    .line 30
    return v0
.end method

.method public final W0(Lk0/t0$b;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lk0/t0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lk0/t0$b;->a(Lk0/t0$b;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    new-instance v0, Lk0/t0$h;

    .line 15
    .line 16
    new-instance v1, Lk0/W0;

    .line 17
    .line 18
    invoke-static {p1}, Lk0/t0$b;->b(Lk0/t0$b;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {p1}, Lk0/t0$b;->c(Lk0/t0$b;)Lx0/T;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, v2, v3}, Lk0/W0;-><init>(Ljava/util/Collection;Lx0/T;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lk0/t0$b;->a(Lk0/t0$b;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {p1}, Lk0/t0$b;->d(Lk0/t0$b;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-direct {v0, v1, v2, v3, v4}, Lk0/t0$h;-><init>(Ld0/I;IJ)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lk0/t0;->b0:Lk0/t0$h;

    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lk0/t0;->H:Lk0/T0;

    .line 43
    .line 44
    invoke-static {p1}, Lk0/t0$b;->b(Lk0/t0$b;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1}, Lk0/t0$b;->c(Lk0/t0$b;)Lx0/T;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, v1, p1}, Lk0/T0;->C(Ljava/util/List;Lx0/T;)Ld0/I;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-virtual {p0, p1, v0}, Lk0/t0;->O(Ld0/I;Z)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public X0(Ljava/util/List;IJLx0/T;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    new-instance v8, Lk0/t0$b;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    move-object v1, v8

    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p5

    .line 9
    move v4, p2

    .line 10
    move-wide v5, p3

    .line 11
    invoke-direct/range {v1 .. v7}, Lk0/t0$b;-><init>(Ljava/util/List;Lx0/T;IJLk0/t0$a;)V

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x11

    .line 15
    .line 16
    invoke-interface {v0, p1, v8}, Lg0/k;->g(ILjava/lang/Object;)Lg0/k$a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Lg0/k$a;->a()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final Y()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v0, Lk0/B0;->f:Lk0/C0;

    .line 8
    .line 9
    iget-wide v1, v1, Lk0/C0;->e:J

    .line 10
    .line 11
    iget-boolean v0, v0, Lk0/B0;->d:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v0, v1, v3

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 25
    .line 26
    iget-wide v3, v0, Lk0/U0;->s:J

    .line 27
    .line 28
    cmp-long v0, v3, v1

    .line 29
    .line 30
    if-ltz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lk0/t0;->o1()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    :cond_0
    const/4 v0, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_0
    return v0
.end method

.method public final Y0(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk0/t0;->Z:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lk0/t0;->Z:Z

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lk0/t0;->N:Lk0/U0;

    .line 11
    .line 12
    iget-boolean p1, p1, Lk0/U0;->p:Z

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lk0/t0;->v:Lg0/k;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-interface {p1, v0}, Lg0/k;->c(I)Z

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final Z0(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lk0/t0;->Q:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lk0/t0;->B0()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lk0/t0;->R:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lk0/t0;->G:Lk0/E0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lk0/E0;->u()Lk0/B0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 17
    .line 18
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eq p1, v0, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-virtual {p0, p1}, Lk0/t0;->L0(Z)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-virtual {p0, p1}, Lk0/t0;->N(Z)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public a(Lk0/Y0;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lg0/k;->c(I)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final synthetic a0()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk0/t0;->P:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public a1(ZII)V
    .locals 1

    .line 1
    shl-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    or-int/2addr p2, p3

    .line 4
    iget-object p3, p0, Lk0/t0;->v:Lg0/k;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-interface {p3, v0, p1, p2}, Lg0/k;->b(III)Lg0/k$a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Lg0/k$a;->a()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-interface {v0, v1}, Lg0/k;->f(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lg0/k;->c(I)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final synthetic b0(Lk0/V0;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lk0/t0;->u(Lk0/V0;)V
    :try_end_0
    .catch Lk0/u; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p1

    .line 6
    const-string v0, "ExoPlayerImplInternal"

    .line 7
    .line 8
    const-string v1, "Unexpected error delivering message on external thread."

    .line 9
    .line 10
    invoke-static {v0, v1, p1}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/lang/RuntimeException;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public final b1(ZIZI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Lk0/t0$e;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lk0/t0;->N:Lk0/U0;

    .line 7
    .line 8
    invoke-virtual {p3, p1, p4, p2}, Lk0/U0;->e(ZII)Lk0/U0;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    iput-object p2, p0, Lk0/t0;->N:Lk0/U0;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-virtual {p0, p2, p2}, Lk0/t0;->B1(ZZ)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lk0/t0;->o0(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lk0/t0;->o1()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lk0/t0;->u1()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lk0/t0;->z1()V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget-object p1, p0, Lk0/t0;->N:Lk0/U0;

    .line 35
    .line 36
    iget p1, p1, Lk0/U0;->e:I

    .line 37
    .line 38
    const/4 p2, 0x3

    .line 39
    const/4 p3, 0x2

    .line 40
    if-ne p1, p2, :cond_1

    .line 41
    .line 42
    iget-object p1, p0, Lk0/t0;->C:Lk0/s;

    .line 43
    .line 44
    invoke-virtual {p1}, Lk0/s;->e()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lk0/t0;->r1()V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget-object p1, p0, Lk0/t0;->v:Lg0/k;

    .line 51
    .line 52
    invoke-interface {p1, p3}, Lg0/k;->c(I)Z

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    if-ne p1, p3, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    :goto_1
    return-void
.end method

.method public declared-synchronized c(Lk0/V0;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lk0/t0;->P:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lk0/t0;->x:Landroid/os/Looper;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 20
    .line 21
    const/16 v1, 0xe

    .line 22
    .line 23
    invoke-interface {v0, v1, p1}, Lg0/k;->g(ILjava/lang/Object;)Lg0/k$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-interface {p1}, Lg0/k$a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    :try_start_1
    const-string v0, "ExoPlayerImplInternal"

    .line 35
    .line 36
    const-string v1, "Ignoring messages sent after release."

    .line 37
    .line 38
    invoke-static {v0, v1}, Lg0/o;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, v0}, Lk0/V0;->k(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    .line 45
    monitor-exit p0

    .line 46
    return-void

    .line 47
    :goto_1
    monitor-exit p0

    .line 48
    throw p1
.end method

.method public final c0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lk0/t0;->n1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput-boolean v0, p0, Lk0/t0;->U:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lk0/E0;->m()Lk0/B0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-wide v2, p0, Lk0/t0;->c0:J

    .line 16
    .line 17
    iget-object v0, p0, Lk0/t0;->C:Lk0/s;

    .line 18
    .line 19
    invoke-virtual {v0}, Lk0/s;->h()Ld0/C;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget v4, v0, Ld0/C;->a:F

    .line 24
    .line 25
    iget-wide v5, p0, Lk0/t0;->T:J

    .line 26
    .line 27
    invoke-virtual/range {v1 .. v6}, Lk0/B0;->e(JFJ)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Lk0/t0;->v1()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public c1(Ld0/C;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-interface {v0, v1, p1}, Lg0/k;->g(ILjava/lang/Object;)Lg0/k$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lg0/k$a;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lg0/k;->c(I)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lk0/t0$e;->c(Lk0/U0;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 9
    .line 10
    invoke-static {v0}, Lk0/t0$e;->a(Lk0/t0$e;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lk0/t0;->F:Lk0/t0$f;

    .line 17
    .line 18
    iget-object v1, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lk0/t0$f;->a(Lk0/t0$e;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lk0/t0$e;

    .line 24
    .line 25
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lk0/t0$e;-><init>(Lk0/U0;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final d1(Ld0/C;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lk0/t0;->V0(Ld0/C;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lk0/t0;->C:Lk0/s;

    .line 5
    .line 6
    invoke-virtual {p1}, Lk0/s;->h()Ld0/C;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, p1, v0}, Lk0/t0;->R(Ld0/C;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public bridge synthetic e(Lx0/S;)V
    .locals 0

    .line 1
    check-cast p1, Lx0/v;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lk0/t0;->q0(Lx0/v;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e0(JJ)V
    .locals 8

    .line 1
    iget-object v0, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_f

    .line 8
    .line 9
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 10
    .line 11
    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    .line 12
    .line 13
    invoke-virtual {v0}, Lx0/x$b;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_7

    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Lk0/t0;->f0:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const-wide/16 v0, 0x1

    .line 26
    .line 27
    sub-long/2addr p1, v0

    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lk0/t0;->f0:Z

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 32
    .line 33
    iget-object v1, v0, Lk0/U0;->a:Ld0/I;

    .line 34
    .line 35
    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    .line 36
    .line 37
    iget-object v0, v0, Lx0/x$b;->a:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ld0/I;->b(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget v1, p0, Lk0/t0;->e0:I

    .line 44
    .line 45
    iget-object v2, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    if-lez v1, :cond_2

    .line 57
    .line 58
    iget-object v3, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 59
    .line 60
    add-int/lit8 v4, v1, -0x1

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lk0/t0$d;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v3, v2

    .line 70
    :goto_0
    if-eqz v3, :cond_5

    .line 71
    .line 72
    iget v4, v3, Lk0/t0$d;->p:I

    .line 73
    .line 74
    if-gt v4, v0, :cond_3

    .line 75
    .line 76
    if-ne v4, v0, :cond_5

    .line 77
    .line 78
    iget-wide v3, v3, Lk0/t0$d;->q:J

    .line 79
    .line 80
    cmp-long v3, v3, p1

    .line 81
    .line 82
    if-lez v3, :cond_5

    .line 83
    .line 84
    :cond_3
    add-int/lit8 v3, v1, -0x1

    .line 85
    .line 86
    if-lez v3, :cond_4

    .line 87
    .line 88
    iget-object v4, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 89
    .line 90
    add-int/lit8 v1, v1, -0x2

    .line 91
    .line 92
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lk0/t0$d;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    move-object v1, v2

    .line 100
    :goto_1
    move v7, v3

    .line 101
    move-object v3, v1

    .line 102
    move v1, v7

    .line 103
    goto :goto_0

    .line 104
    :cond_5
    iget-object v3, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-ge v1, v3, :cond_6

    .line 111
    .line 112
    :goto_2
    iget-object v3, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Lk0/t0$d;

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    move-object v3, v2

    .line 122
    :goto_3
    if-eqz v3, :cond_8

    .line 123
    .line 124
    iget-object v4, v3, Lk0/t0$d;->r:Ljava/lang/Object;

    .line 125
    .line 126
    if-eqz v4, :cond_8

    .line 127
    .line 128
    iget v4, v3, Lk0/t0$d;->p:I

    .line 129
    .line 130
    if-lt v4, v0, :cond_7

    .line 131
    .line 132
    if-ne v4, v0, :cond_8

    .line 133
    .line 134
    iget-wide v4, v3, Lk0/t0$d;->q:J

    .line 135
    .line 136
    cmp-long v4, v4, p1

    .line 137
    .line 138
    if-gtz v4, :cond_8

    .line 139
    .line 140
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 141
    .line 142
    iget-object v3, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-ge v1, v3, :cond_6

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_8
    :goto_4
    if-eqz v3, :cond_e

    .line 152
    .line 153
    iget-object v4, v3, Lk0/t0$d;->r:Ljava/lang/Object;

    .line 154
    .line 155
    if-eqz v4, :cond_e

    .line 156
    .line 157
    iget v4, v3, Lk0/t0$d;->p:I

    .line 158
    .line 159
    if-ne v4, v0, :cond_e

    .line 160
    .line 161
    iget-wide v4, v3, Lk0/t0$d;->q:J

    .line 162
    .line 163
    cmp-long v6, v4, p1

    .line 164
    .line 165
    if-lez v6, :cond_e

    .line 166
    .line 167
    cmp-long v4, v4, p3

    .line 168
    .line 169
    if-gtz v4, :cond_e

    .line 170
    .line 171
    :try_start_0
    iget-object v4, v3, Lk0/t0$d;->o:Lk0/V0;

    .line 172
    .line 173
    invoke-virtual {p0, v4}, Lk0/t0;->Q0(Lk0/V0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    .line 175
    .line 176
    iget-object v4, v3, Lk0/t0$d;->o:Lk0/V0;

    .line 177
    .line 178
    invoke-virtual {v4}, Lk0/V0;->b()Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-nez v4, :cond_a

    .line 183
    .line 184
    iget-object v3, v3, Lk0/t0$d;->o:Lk0/V0;

    .line 185
    .line 186
    invoke-virtual {v3}, Lk0/V0;->j()Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_9

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_a
    :goto_5
    iget-object v3, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    :goto_6
    iget-object v3, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-ge v1, v3, :cond_b

    .line 208
    .line 209
    iget-object v3, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 210
    .line 211
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    check-cast v3, Lk0/t0$d;

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_b
    move-object v3, v2

    .line 219
    goto :goto_4

    .line 220
    :catchall_0
    move-exception p1

    .line 221
    iget-object p2, v3, Lk0/t0$d;->o:Lk0/V0;

    .line 222
    .line 223
    invoke-virtual {p2}, Lk0/V0;->b()Z

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    if-nez p2, :cond_c

    .line 228
    .line 229
    iget-object p2, v3, Lk0/t0$d;->o:Lk0/V0;

    .line 230
    .line 231
    invoke-virtual {p2}, Lk0/V0;->j()Z

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    if-eqz p2, :cond_d

    .line 236
    .line 237
    :cond_c
    iget-object p2, p0, Lk0/t0;->D:Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    :cond_d
    throw p1

    .line 243
    :cond_e
    iput v1, p0, Lk0/t0;->e0:I

    .line 244
    .line 245
    :cond_f
    :goto_7
    return-void
.end method

.method public final e1(Lk0/w$c;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lk0/t0;->j0:Lk0/w$c;

    .line 2
    .line 3
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 4
    .line 5
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 6
    .line 7
    iget-object v1, v1, Lk0/U0;->a:Ld0/I;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Lk0/E0;->Q(Ld0/I;Lk0/w$c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final f0()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    iget-wide v1, p0, Lk0/t0;->c0:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Lk0/E0;->F(J)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lk0/E0;->O()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 18
    .line 19
    iget-wide v2, p0, Lk0/t0;->c0:J

    .line 20
    .line 21
    iget-object v4, p0, Lk0/t0;->N:Lk0/U0;

    .line 22
    .line 23
    invoke-virtual {v0, v2, v3, v4}, Lk0/E0;->s(JLk0/U0;)Lk0/C0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v2, p0, Lk0/t0;->G:Lk0/E0;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Lk0/E0;->g(Lk0/C0;)Lk0/B0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v3, v2, Lk0/B0;->a:Lx0/v;

    .line 36
    .line 37
    iget-wide v4, v0, Lk0/C0;->b:J

    .line 38
    .line 39
    invoke-interface {v3, p0, v4, v5}, Lx0/v;->u(Lx0/v$a;J)V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lk0/t0;->G:Lk0/E0;

    .line 43
    .line 44
    invoke-virtual {v3}, Lk0/E0;->t()Lk0/B0;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-ne v3, v2, :cond_0

    .line 49
    .line 50
    iget-wide v2, v0, Lk0/C0;->b:J

    .line 51
    .line 52
    invoke-virtual {p0, v2, v3}, Lk0/t0;->C0(J)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-virtual {p0, v1}, Lk0/t0;->N(Z)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    :cond_1
    iget-boolean v0, p0, Lk0/t0;->U:Z

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, Lk0/t0;->W()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iput-boolean v0, p0, Lk0/t0;->U:Z

    .line 68
    .line 69
    invoke-virtual {p0}, Lk0/t0;->v1()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-virtual {p0}, Lk0/t0;->c0()V

    .line 74
    .line 75
    .line 76
    :goto_0
    return v1
.end method

.method public f1(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v0, v1, p1, v2}, Lg0/k;->b(III)Lg0/k$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lg0/k$a;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final g0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    invoke-virtual {v0}, Lk0/B0;->p()LA0/E;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    :goto_0
    iget-object v4, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 17
    .line 18
    array-length v4, v4

    .line 19
    const/4 v5, 0x1

    .line 20
    if-ge v2, v4, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0, v2}, LA0/E;->c(I)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    iget-object v4, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 29
    .line 30
    aget-object v4, v4, v2

    .line 31
    .line 32
    invoke-interface {v4}, Lk0/Y0;->l()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eq v4, v5, :cond_0

    .line 37
    .line 38
    move v0, v1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object v4, v0, LA0/E;->b:[Lk0/b1;

    .line 41
    .line 42
    aget-object v4, v4, v2

    .line 43
    .line 44
    iget v4, v4, Lk0/b1;->a:I

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    move v3, v5

    .line 49
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v0, v5

    .line 53
    :goto_1
    if-eqz v3, :cond_3

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    move v1, v5

    .line 58
    :cond_3
    invoke-virtual {p0, v1}, Lk0/t0;->Y0(Z)V

    .line 59
    .line 60
    .line 61
    :cond_4
    return-void
.end method

.method public final g1(I)V
    .locals 2

    .line 1
    iput p1, p0, Lk0/t0;->V:I

    .line 2
    .line 3
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 4
    .line 5
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 6
    .line 7
    iget-object v1, v1, Lk0/U0;->a:Ld0/I;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Lk0/E0;->S(Ld0/I;I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-virtual {p0, p1}, Lk0/t0;->L0(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1}, Lk0/t0;->N(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final h0()V
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Lk0/t0;->m1()Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-eqz v2, :cond_3

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lk0/t0;->d0()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lk0/t0;->G:Lk0/E0;

    .line 15
    .line 16
    invoke-virtual {v1}, Lk0/E0;->b()Lk0/B0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lk0/B0;

    .line 25
    .line 26
    iget-object v2, p0, Lk0/t0;->N:Lk0/U0;

    .line 27
    .line 28
    iget-object v2, v2, Lk0/U0;->b:Lx0/x$b;

    .line 29
    .line 30
    iget-object v2, v2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v3, v1, Lk0/B0;->f:Lk0/C0;

    .line 33
    .line 34
    iget-object v3, v3, Lk0/C0;->a:Lx0/x$b;

    .line 35
    .line 36
    iget-object v3, v3, Lx0/x$b;->a:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v3, 0x1

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    iget-object v2, p0, Lk0/t0;->N:Lk0/U0;

    .line 46
    .line 47
    iget-object v2, v2, Lk0/U0;->b:Lx0/x$b;

    .line 48
    .line 49
    iget v4, v2, Lx0/x$b;->b:I

    .line 50
    .line 51
    const/4 v5, -0x1

    .line 52
    if-ne v4, v5, :cond_1

    .line 53
    .line 54
    iget-object v4, v1, Lk0/B0;->f:Lk0/C0;

    .line 55
    .line 56
    iget-object v4, v4, Lk0/C0;->a:Lx0/x$b;

    .line 57
    .line 58
    iget v6, v4, Lx0/x$b;->b:I

    .line 59
    .line 60
    if-ne v6, v5, :cond_1

    .line 61
    .line 62
    iget v2, v2, Lx0/x$b;->e:I

    .line 63
    .line 64
    iget v4, v4, Lx0/x$b;->e:I

    .line 65
    .line 66
    if-eq v2, v4, :cond_1

    .line 67
    .line 68
    move v2, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move v2, v0

    .line 71
    :goto_1
    iget-object v1, v1, Lk0/B0;->f:Lk0/C0;

    .line 72
    .line 73
    iget-object v5, v1, Lk0/C0;->a:Lx0/x$b;

    .line 74
    .line 75
    iget-wide v10, v1, Lk0/C0;->b:J

    .line 76
    .line 77
    iget-wide v8, v1, Lk0/C0;->c:J

    .line 78
    .line 79
    xor-int/lit8 v12, v2, 0x1

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    move-object v4, p0

    .line 83
    move-wide v6, v10

    .line 84
    invoke-virtual/range {v4 .. v13}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 89
    .line 90
    invoke-virtual {p0}, Lk0/t0;->B0()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lk0/t0;->z1()V

    .line 94
    .line 95
    .line 96
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 97
    .line 98
    iget v1, v1, Lk0/U0;->e:I

    .line 99
    .line 100
    const/4 v2, 0x3

    .line 101
    if-ne v1, v2, :cond_2

    .line 102
    .line 103
    invoke-virtual {p0}, Lk0/t0;->r1()V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {p0}, Lk0/t0;->r()V

    .line 107
    .line 108
    .line 109
    move v1, v3

    .line 110
    goto :goto_0

    .line 111
    :cond_3
    return-void
.end method

.method public final h1(Lk0/d1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/t0;->M:Lk0/d1;

    .line 2
    .line 3
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 15

    .line 1
    move-object v11, p0

    move-object/from16 v1, p1

    const-string v2, "Playback error"

    const-string v3, "ExoPlayerImplInternal"

    const/16 v4, 0x3e8

    const/4 v12, 0x0

    const/4 v13, 0x1

    :try_start_0
    iget v5, v1, Landroid/os/Message;->what:I

    packed-switch v5, :pswitch_data_0

    :pswitch_0
    return v12

    :pswitch_1
    invoke-virtual {p0}, Lk0/t0;->s0()V

    goto/16 :goto_11

    :catch_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_4

    :catch_1
    move-exception v0

    move-object v1, v0

    goto/16 :goto_6

    :catch_2
    move-exception v0

    move-object v1, v0

    goto/16 :goto_8

    :catch_3
    move-exception v0

    move-object v1, v0

    goto/16 :goto_9

    :catch_4
    move-exception v0

    move-object v1, v0

    goto/16 :goto_a

    :catch_5
    move-exception v0

    move-object v1, v0

    goto/16 :goto_d

    :catch_6
    move-exception v0

    move-object v1, v0

    goto/16 :goto_e

    :pswitch_2
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lk0/w$c;

    invoke-virtual {p0, v1}, Lk0/t0;->e1(Lk0/w$c;)V

    goto/16 :goto_11

    :pswitch_3
    iget v5, v1, Landroid/os/Message;->arg1:I

    iget v6, v1, Landroid/os/Message;->arg2:I

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-virtual {p0, v5, v6, v1}, Lk0/t0;->x1(IILjava/util/List;)V

    goto/16 :goto_11

    :pswitch_4
    invoke-virtual {p0}, Lk0/t0;->z0()V

    goto/16 :goto_11

    :pswitch_5
    invoke-virtual {p0}, Lk0/t0;->s()V

    goto/16 :goto_11

    :pswitch_6
    iget v1, v1, Landroid/os/Message;->arg1:I

    if-eqz v1, :cond_0

    move v1, v13

    goto :goto_0

    :cond_0
    move v1, v12

    :goto_0
    invoke-virtual {p0, v1}, Lk0/t0;->Z0(Z)V

    goto/16 :goto_11

    :pswitch_7
    invoke-virtual {p0}, Lk0/t0;->l0()V

    goto/16 :goto_11

    :pswitch_8
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lx0/T;

    invoke-virtual {p0, v1}, Lk0/t0;->k1(Lx0/T;)V

    goto/16 :goto_11

    :pswitch_9
    iget v5, v1, Landroid/os/Message;->arg1:I

    iget v6, v1, Landroid/os/Message;->arg2:I

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lx0/T;

    invoke-virtual {p0, v5, v6, v1}, Lk0/t0;->w0(IILx0/T;)V

    goto/16 :goto_11

    :pswitch_a
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lk0/t0;->m0(Lk0/t0$c;)V

    goto/16 :goto_11

    :pswitch_b
    iget-object v5, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v5, Lk0/t0$b;

    iget v1, v1, Landroid/os/Message;->arg1:I

    invoke-virtual {p0, v5, v1}, Lk0/t0;->q(Lk0/t0$b;I)V

    goto/16 :goto_11

    :pswitch_c
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lk0/t0$b;

    invoke-virtual {p0, v1}, Lk0/t0;->W0(Lk0/t0$b;)V

    goto/16 :goto_11

    :pswitch_d
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ld0/C;

    invoke-virtual {p0, v1, v12}, Lk0/t0;->R(Ld0/C;Z)V

    goto/16 :goto_11

    :pswitch_e
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lk0/V0;

    invoke-virtual {p0, v1}, Lk0/t0;->R0(Lk0/V0;)V

    goto/16 :goto_11

    :pswitch_f
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lk0/V0;

    invoke-virtual {p0, v1}, Lk0/t0;->P0(Lk0/V0;)V

    goto/16 :goto_11

    :pswitch_10
    iget v5, v1, Landroid/os/Message;->arg1:I

    if-eqz v5, :cond_1

    move v5, v13

    goto :goto_1

    :cond_1
    move v5, v12

    :goto_1
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0, v5, v1}, Lk0/t0;->U0(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    goto/16 :goto_11

    :pswitch_11
    iget v1, v1, Landroid/os/Message;->arg1:I

    if-eqz v1, :cond_2

    move v1, v13

    goto :goto_2

    :cond_2
    move v1, v12

    :goto_2
    invoke-virtual {p0, v1}, Lk0/t0;->j1(Z)V

    goto/16 :goto_11

    :pswitch_12
    iget v1, v1, Landroid/os/Message;->arg1:I

    invoke-virtual {p0, v1}, Lk0/t0;->g1(I)V

    goto/16 :goto_11

    :pswitch_13
    invoke-virtual {p0}, Lk0/t0;->y0()V

    goto/16 :goto_11

    :pswitch_14
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lx0/v;

    invoke-virtual {p0, v1}, Lk0/t0;->L(Lx0/v;)V

    goto/16 :goto_11

    :pswitch_15
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lx0/v;

    invoke-virtual {p0, v1}, Lk0/t0;->P(Lx0/v;)V

    goto/16 :goto_11

    :pswitch_16
    invoke-virtual {p0}, Lk0/t0;->u0()V

    return v13

    :pswitch_17
    invoke-virtual {p0, v12, v13}, Lk0/t0;->t1(ZZ)V

    goto/16 :goto_11

    :pswitch_18
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lk0/d1;

    invoke-virtual {p0, v1}, Lk0/t0;->h1(Lk0/d1;)V

    goto/16 :goto_11

    :pswitch_19
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ld0/C;

    invoke-virtual {p0, v1}, Lk0/t0;->d1(Ld0/C;)V

    goto/16 :goto_11

    :pswitch_1a
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lk0/t0$h;

    invoke-virtual {p0, v1}, Lk0/t0;->M0(Lk0/t0$h;)V

    goto/16 :goto_11

    :pswitch_1b
    invoke-virtual {p0}, Lk0/t0;->w()V

    goto/16 :goto_11

    :pswitch_1c
    iget v5, v1, Landroid/os/Message;->arg1:I

    if-eqz v5, :cond_3

    move v5, v13

    goto :goto_3

    :cond_3
    move v5, v12

    :goto_3
    iget v1, v1, Landroid/os/Message;->arg2:I

    shr-int/lit8 v6, v1, 0x4

    and-int/lit8 v1, v1, 0xf

    invoke-virtual {p0, v5, v6, v13, v1}, Lk0/t0;->b1(ZIZI)V
    :try_end_0
    .catch Lk0/u; {:try_start_0 .. :try_end_0} :catch_6
    .catch Lp0/n$a; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ld0/A; {:try_start_0 .. :try_end_0} :catch_4
    .catch Li0/h; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lx0/b; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_11

    :goto_4
    instance-of v5, v1, Ljava/lang/IllegalStateException;

    if-nez v5, :cond_4

    instance-of v5, v1, Ljava/lang/IllegalArgumentException;

    if-eqz v5, :cond_5

    :cond_4
    const/16 v4, 0x3ec

    :cond_5
    invoke-static {v1, v4}, Lk0/u;->d(Ljava/lang/RuntimeException;I)Lk0/u;

    move-result-object v1

    invoke-static {v3, v2, v1}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v13, v12}, Lk0/t0;->t1(ZZ)V

    iget-object v2, v11, Lk0/t0;->N:Lk0/U0;

    invoke-virtual {v2, v1}, Lk0/U0;->f(Lk0/u;)Lk0/U0;

    move-result-object v1

    :goto_5
    iput-object v1, v11, Lk0/t0;->N:Lk0/U0;

    goto/16 :goto_11

    :goto_6
    const/16 v2, 0x7d0

    :goto_7
    invoke-virtual {p0, v1, v2}, Lk0/t0;->M(Ljava/io/IOException;I)V

    goto/16 :goto_11

    :goto_8
    const/16 v2, 0x3ea

    goto :goto_7

    :goto_9
    iget v2, v1, Li0/h;->o:I

    goto :goto_7

    :goto_a
    iget v2, v1, Ld0/A;->p:I

    if-ne v2, v13, :cond_7

    iget-boolean v2, v1, Ld0/A;->o:Z

    if-eqz v2, :cond_6

    const/16 v2, 0xbb9

    :goto_b
    move v4, v2

    goto :goto_c

    :cond_6
    const/16 v2, 0xbbb

    goto :goto_b

    :cond_7
    const/4 v3, 0x4

    if-ne v2, v3, :cond_9

    iget-boolean v2, v1, Ld0/A;->o:Z

    if-eqz v2, :cond_8

    const/16 v2, 0xbba

    goto :goto_b

    :cond_8
    const/16 v2, 0xbbc

    goto :goto_b

    :cond_9
    :goto_c
    invoke-virtual {p0, v1, v4}, Lk0/t0;->M(Ljava/io/IOException;I)V

    goto/16 :goto_11

    :goto_d
    iget v2, v1, Lp0/n$a;->o:I

    goto :goto_7

    :goto_e
    iget v4, v1, Lk0/u;->x:I

    if-ne v4, v13, :cond_a

    iget-object v4, v11, Lk0/t0;->G:Lk0/E0;

    invoke-virtual {v4}, Lk0/E0;->u()Lk0/B0;

    move-result-object v4

    if-eqz v4, :cond_a

    iget-object v4, v4, Lk0/B0;->f:Lk0/C0;

    iget-object v4, v4, Lk0/C0;->a:Lx0/x$b;

    invoke-virtual {v1, v4}, Lk0/u;->a(Lx0/x$b;)Lk0/u;

    move-result-object v1

    :cond_a
    iget-boolean v4, v1, Lk0/u;->D:Z

    if-eqz v4, :cond_d

    iget-object v4, v11, Lk0/t0;->g0:Lk0/u;

    if-eqz v4, :cond_b

    iget v4, v1, Ld0/B;->o:I

    const/16 v5, 0x138c

    if-eq v4, v5, :cond_b

    const/16 v5, 0x138b

    if-ne v4, v5, :cond_d

    :cond_b
    const-string v2, "Recoverable renderer error"

    invoke-static {v3, v2, v1}, Lg0/o;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v2, v11, Lk0/t0;->g0:Lk0/u;

    if-eqz v2, :cond_c

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    iget-object v1, v11, Lk0/t0;->g0:Lk0/u;

    goto :goto_f

    :cond_c
    iput-object v1, v11, Lk0/t0;->g0:Lk0/u;

    :goto_f
    iget-object v2, v11, Lk0/t0;->v:Lg0/k;

    const/16 v3, 0x19

    invoke-interface {v2, v3, v1}, Lg0/k;->g(ILjava/lang/Object;)Lg0/k$a;

    move-result-object v1

    invoke-interface {v2, v1}, Lg0/k;->d(Lg0/k$a;)Z

    goto :goto_11

    :cond_d
    iget-object v4, v11, Lk0/t0;->g0:Lk0/u;

    if-eqz v4, :cond_e

    invoke-virtual {v4, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    iget-object v1, v11, Lk0/t0;->g0:Lk0/u;

    :cond_e
    move-object v14, v1

    invoke-static {v3, v2, v14}, Lg0/o;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget v1, v14, Lk0/u;->x:I

    if-ne v1, v13, :cond_10

    iget-object v1, v11, Lk0/t0;->G:Lk0/E0;

    invoke-virtual {v1}, Lk0/E0;->t()Lk0/B0;

    move-result-object v1

    iget-object v2, v11, Lk0/t0;->G:Lk0/E0;

    invoke-virtual {v2}, Lk0/E0;->u()Lk0/B0;

    move-result-object v2

    if-eq v1, v2, :cond_10

    :goto_10
    iget-object v1, v11, Lk0/t0;->G:Lk0/E0;

    invoke-virtual {v1}, Lk0/E0;->t()Lk0/B0;

    move-result-object v1

    iget-object v2, v11, Lk0/t0;->G:Lk0/E0;

    invoke-virtual {v2}, Lk0/E0;->u()Lk0/B0;

    move-result-object v2

    if-eq v1, v2, :cond_f

    iget-object v1, v11, Lk0/t0;->G:Lk0/E0;

    invoke-virtual {v1}, Lk0/E0;->b()Lk0/B0;

    goto :goto_10

    :cond_f
    iget-object v1, v11, Lk0/t0;->G:Lk0/E0;

    invoke-virtual {v1}, Lk0/E0;->t()Lk0/B0;

    move-result-object v1

    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk0/B0;

    invoke-virtual {p0}, Lk0/t0;->d0()V

    iget-object v1, v1, Lk0/B0;->f:Lk0/C0;

    iget-object v2, v1, Lk0/C0;->a:Lx0/x$b;

    iget-wide v7, v1, Lk0/C0;->b:J

    iget-wide v5, v1, Lk0/C0;->c:J

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v1, p0

    move-wide v3, v7

    invoke-virtual/range {v1 .. v10}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    move-result-object v1

    iput-object v1, v11, Lk0/t0;->N:Lk0/U0;

    :cond_10
    invoke-virtual {p0, v13, v12}, Lk0/t0;->t1(ZZ)V

    iget-object v1, v11, Lk0/t0;->N:Lk0/U0;

    invoke-virtual {v1, v14}, Lk0/U0;->f(Lk0/u;)Lk0/U0;

    move-result-object v1

    goto/16 :goto_5

    :goto_11
    invoke-virtual {p0}, Lk0/t0;->d0()V

    return v13

    nop

    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final i0(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk0/t0;->j0:Lk0/w$c;

    .line 2
    .line 3
    iget-wide v0, v0, Lk0/w$c;->a:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lk0/t0;->N:Lk0/U0;

    .line 17
    .line 18
    iget-object p1, p1, Lk0/U0;->a:Ld0/I;

    .line 19
    .line 20
    iget-object v0, p0, Lk0/t0;->k0:Ld0/I;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ld0/I;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p1, p0, Lk0/t0;->N:Lk0/U0;

    .line 30
    .line 31
    iget-object p1, p1, Lk0/U0;->a:Ld0/I;

    .line 32
    .line 33
    iput-object p1, p0, Lk0/t0;->k0:Ld0/I;

    .line 34
    .line 35
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lk0/E0;->x(Ld0/I;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void
.end method

.method public i1(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xc

    .line 5
    .line 6
    invoke-interface {v0, v2, p1, v1}, Lg0/k;->b(III)Lg0/k$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Lg0/k$a;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public j(Ld0/C;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lg0/k;->g(ILjava/lang/Object;)Lg0/k$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lg0/k$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final j0()V
    .locals 14

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->u()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Lk0/B0;->k()Lk0/B0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    if-eqz v1, :cond_a

    .line 21
    .line 22
    iget-boolean v1, p0, Lk0/t0;->R:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Lk0/t0;->U()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    invoke-virtual {v0}, Lk0/B0;->k()Lk0/B0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-boolean v1, v1, Lk0/B0;->d:Z

    .line 40
    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    iget-wide v1, p0, Lk0/t0;->c0:J

    .line 44
    .line 45
    invoke-virtual {v0}, Lk0/B0;->k()Lk0/B0;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Lk0/B0;->n()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    cmp-long v1, v1, v3

    .line 54
    .line 55
    if-gez v1, :cond_3

    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    invoke-virtual {v0}, Lk0/B0;->p()LA0/E;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    iget-object v1, p0, Lk0/t0;->G:Lk0/E0;

    .line 63
    .line 64
    invoke-virtual {v1}, Lk0/E0;->c()Lk0/B0;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    invoke-virtual {v12}, Lk0/B0;->p()LA0/E;

    .line 69
    .line 70
    .line 71
    move-result-object v13

    .line 72
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 73
    .line 74
    iget-object v3, v1, Lk0/U0;->a:Ld0/I;

    .line 75
    .line 76
    iget-object v1, v12, Lk0/B0;->f:Lk0/C0;

    .line 77
    .line 78
    iget-object v2, v1, Lk0/C0;->a:Lx0/x$b;

    .line 79
    .line 80
    iget-object v0, v0, Lk0/B0;->f:Lk0/C0;

    .line 81
    .line 82
    iget-object v4, v0, Lk0/C0;->a:Lx0/x$b;

    .line 83
    .line 84
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    move-object v0, p0

    .line 91
    move-object v1, v3

    .line 92
    invoke-virtual/range {v0 .. v7}, Lk0/t0;->A1(Ld0/I;Lx0/x$b;Ld0/I;Lx0/x$b;JZ)V

    .line 93
    .line 94
    .line 95
    iget-boolean v0, v12, Lk0/B0;->d:Z

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    iget-object v0, v12, Lk0/B0;->a:Lx0/v;

    .line 100
    .line 101
    invoke-interface {v0}, Lx0/v;->l()J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    cmp-long v0, v0, v8

    .line 106
    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    invoke-virtual {v12}, Lk0/B0;->n()J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    invoke-virtual {p0, v0, v1}, Lk0/t0;->S0(J)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12}, Lk0/B0;->s()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_4

    .line 121
    .line 122
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 123
    .line 124
    invoke-virtual {v0, v12}, Lk0/E0;->I(Lk0/B0;)Z

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v10}, Lk0/t0;->N(Z)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lk0/t0;->c0()V

    .line 131
    .line 132
    .line 133
    :cond_4
    return-void

    .line 134
    :cond_5
    move v0, v10

    .line 135
    :goto_0
    iget-object v1, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 136
    .line 137
    array-length v1, v1

    .line 138
    if-ge v0, v1, :cond_9

    .line 139
    .line 140
    invoke-virtual {v11, v0}, LA0/E;->c(I)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    invoke-virtual {v13, v0}, LA0/E;->c(I)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v1, :cond_8

    .line 149
    .line 150
    iget-object v1, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 151
    .line 152
    aget-object v1, v1, v0

    .line 153
    .line 154
    invoke-interface {v1}, Lk0/Y0;->A()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_8

    .line 159
    .line 160
    iget-object v1, p0, Lk0/t0;->q:[Lk0/a1;

    .line 161
    .line 162
    aget-object v1, v1, v0

    .line 163
    .line 164
    invoke-interface {v1}, Lk0/a1;->l()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    const/4 v3, -0x2

    .line 169
    if-ne v1, v3, :cond_6

    .line 170
    .line 171
    const/4 v1, 0x1

    .line 172
    goto :goto_1

    .line 173
    :cond_6
    move v1, v10

    .line 174
    :goto_1
    iget-object v3, v11, LA0/E;->b:[Lk0/b1;

    .line 175
    .line 176
    aget-object v3, v3, v0

    .line 177
    .line 178
    iget-object v4, v13, LA0/E;->b:[Lk0/b1;

    .line 179
    .line 180
    aget-object v4, v4, v0

    .line 181
    .line 182
    if-eqz v2, :cond_7

    .line 183
    .line 184
    invoke-virtual {v4, v3}, Lk0/b1;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_7

    .line 189
    .line 190
    if-eqz v1, :cond_8

    .line 191
    .line 192
    :cond_7
    iget-object v1, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 193
    .line 194
    aget-object v1, v1, v0

    .line 195
    .line 196
    invoke-virtual {v12}, Lk0/B0;->n()J

    .line 197
    .line 198
    .line 199
    move-result-wide v2

    .line 200
    invoke-virtual {p0, v1, v2, v3}, Lk0/t0;->T0(Lk0/Y0;J)V

    .line 201
    .line 202
    .line 203
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_9
    return-void

    .line 207
    :cond_a
    :goto_2
    iget-object v1, v0, Lk0/B0;->f:Lk0/C0;

    .line 208
    .line 209
    iget-boolean v1, v1, Lk0/C0;->i:Z

    .line 210
    .line 211
    if-nez v1, :cond_b

    .line 212
    .line 213
    iget-boolean v1, p0, Lk0/t0;->R:Z

    .line 214
    .line 215
    if-eqz v1, :cond_e

    .line 216
    .line 217
    :cond_b
    :goto_3
    iget-object v1, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 218
    .line 219
    array-length v2, v1

    .line 220
    if-ge v10, v2, :cond_e

    .line 221
    .line 222
    aget-object v1, v1, v10

    .line 223
    .line 224
    iget-object v2, v0, Lk0/B0;->c:[Lx0/Q;

    .line 225
    .line 226
    aget-object v2, v2, v10

    .line 227
    .line 228
    if-eqz v2, :cond_d

    .line 229
    .line 230
    invoke-interface {v1}, Lk0/Y0;->i()Lx0/Q;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    if-ne v3, v2, :cond_d

    .line 235
    .line 236
    invoke-interface {v1}, Lk0/Y0;->p()Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_d

    .line 241
    .line 242
    iget-object v2, v0, Lk0/B0;->f:Lk0/C0;

    .line 243
    .line 244
    iget-wide v2, v2, Lk0/C0;->e:J

    .line 245
    .line 246
    cmp-long v4, v2, v8

    .line 247
    .line 248
    if-eqz v4, :cond_c

    .line 249
    .line 250
    const-wide/high16 v4, -0x8000000000000000L

    .line 251
    .line 252
    cmp-long v2, v2, v4

    .line 253
    .line 254
    if-eqz v2, :cond_c

    .line 255
    .line 256
    invoke-virtual {v0}, Lk0/B0;->m()J

    .line 257
    .line 258
    .line 259
    move-result-wide v2

    .line 260
    iget-object v4, v0, Lk0/B0;->f:Lk0/C0;

    .line 261
    .line 262
    iget-wide v4, v4, Lk0/C0;->e:J

    .line 263
    .line 264
    add-long/2addr v2, v4

    .line 265
    goto :goto_4

    .line 266
    :cond_c
    move-wide v2, v8

    .line 267
    :goto_4
    invoke-virtual {p0, v1, v2, v3}, Lk0/t0;->T0(Lk0/Y0;J)V

    .line 268
    .line 269
    .line 270
    :cond_d
    add-int/lit8 v10, v10, 0x1

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_e
    return-void
.end method

.method public final j1(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lk0/t0;->W:Z

    .line 2
    .line 3
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 4
    .line 5
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 6
    .line 7
    iget-object v1, v1, Lk0/U0;->a:Ld0/I;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Lk0/E0;->T(Ld0/I;Z)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-virtual {p0, p1}, Lk0/t0;->L0(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1}, Lk0/t0;->N(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public k(Lx0/v;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lg0/k;->g(ILjava/lang/Object;)Lg0/k$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lg0/k$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final k0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->u()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lk0/t0;->G:Lk0/E0;

    .line 10
    .line 11
    invoke-virtual {v1}, Lk0/E0;->t()Lk0/B0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v1, v0, :cond_1

    .line 16
    .line 17
    iget-boolean v0, v0, Lk0/B0;->g:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lk0/t0;->x0()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lk0/t0;->y()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void
.end method

.method public final k1(Lx0/T;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lk0/t0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lk0/t0;->H:Lk0/T0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lk0/T0;->D(Lx0/T;)Ld0/I;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, p1, v0}, Lk0/t0;->O(Ld0/I;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final l0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->H:Lk0/T0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/T0;->i()Ld0/I;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v0, v1}, Lk0/t0;->O(Ld0/I;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final l1(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 2
    .line 3
    iget v1, v0, Lk0/U0;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, Lk0/t0;->i0:J

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lk0/U0;->h(I)Lk0/U0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lk0/t0;->N:Lk0/U0;

    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final m0(Lk0/t0$c;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, v0}, Lk0/t0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    throw p1
.end method

.method public final m1()Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Lk0/t0;->o1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-boolean v0, p0, Lk0/t0;->R:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 15
    .line 16
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    return v1

    .line 23
    :cond_2
    invoke-virtual {v0}, Lk0/B0;->k()Lk0/B0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-wide v2, p0, Lk0/t0;->c0:J

    .line 30
    .line 31
    invoke-virtual {v0}, Lk0/B0;->n()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    cmp-long v2, v2, v4

    .line 36
    .line 37
    if-ltz v2, :cond_3

    .line 38
    .line 39
    iget-boolean v0, v0, Lk0/B0;->g:Z

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    :cond_3
    return v1
.end method

.method public final n0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lk0/B0;->p()LA0/E;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, LA0/E;->c:[LA0/y;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4}, LA0/y;->t()V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lk0/B0;->k()Lk0/B0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method public final n1()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->W()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    iget-object v1, v0, Lk0/t0;->G:Lk0/E0;

    .line 12
    .line 13
    invoke-virtual {v1}, Lk0/E0;->m()Lk0/B0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lk0/B0;->l()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    invoke-virtual {v0, v3, v4}, Lk0/t0;->K(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    iget-object v5, v0, Lk0/t0;->G:Lk0/E0;

    .line 26
    .line 27
    invoke-virtual {v5}, Lk0/E0;->t()Lk0/B0;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-ne v1, v5, :cond_1

    .line 32
    .line 33
    iget-wide v5, v0, Lk0/t0;->c0:J

    .line 34
    .line 35
    invoke-virtual {v1, v5, v6}, Lk0/B0;->A(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    :goto_0
    move-wide v9, v5

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-wide v5, v0, Lk0/t0;->c0:J

    .line 42
    .line 43
    invoke-virtual {v1, v5, v6}, Lk0/B0;->A(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    iget-object v7, v1, Lk0/B0;->f:Lk0/C0;

    .line 48
    .line 49
    iget-wide v7, v7, Lk0/C0;->b:J

    .line 50
    .line 51
    sub-long/2addr v5, v7

    .line 52
    goto :goto_0

    .line 53
    :goto_1
    iget-object v5, v0, Lk0/t0;->N:Lk0/U0;

    .line 54
    .line 55
    iget-object v5, v5, Lk0/U0;->a:Ld0/I;

    .line 56
    .line 57
    iget-object v6, v1, Lk0/B0;->f:Lk0/C0;

    .line 58
    .line 59
    iget-object v6, v6, Lk0/C0;->a:Lx0/x$b;

    .line 60
    .line 61
    invoke-virtual {v0, v5, v6}, Lk0/t0;->q1(Ld0/I;Lx0/x$b;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    iget-object v5, v0, Lk0/t0;->I:Lk0/w0;

    .line 68
    .line 69
    invoke-interface {v5}, Lk0/w0;->e()J

    .line 70
    .line 71
    .line 72
    move-result-wide v5

    .line 73
    :goto_2
    move-wide/from16 v16, v5

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :goto_3
    new-instance v15, Lk0/x0$a;

    .line 83
    .line 84
    iget-object v6, v0, Lk0/t0;->K:Ll0/y1;

    .line 85
    .line 86
    iget-object v5, v0, Lk0/t0;->N:Lk0/U0;

    .line 87
    .line 88
    iget-object v7, v5, Lk0/U0;->a:Ld0/I;

    .line 89
    .line 90
    iget-object v1, v1, Lk0/B0;->f:Lk0/C0;

    .line 91
    .line 92
    iget-object v8, v1, Lk0/C0;->a:Lx0/x$b;

    .line 93
    .line 94
    iget-object v1, v0, Lk0/t0;->C:Lk0/s;

    .line 95
    .line 96
    invoke-virtual {v1}, Lk0/s;->h()Ld0/C;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget v13, v1, Ld0/C;->a:F

    .line 101
    .line 102
    iget-object v1, v0, Lk0/t0;->N:Lk0/U0;

    .line 103
    .line 104
    iget-boolean v14, v1, Lk0/U0;->l:Z

    .line 105
    .line 106
    iget-boolean v1, v0, Lk0/t0;->S:Z

    .line 107
    .line 108
    move-object v5, v15

    .line 109
    move-wide v11, v3

    .line 110
    move-object v2, v15

    .line 111
    move v15, v1

    .line 112
    invoke-direct/range {v5 .. v17}, Lk0/x0$a;-><init>(Ll0/y1;Ld0/I;Lx0/x$b;JJFZZJ)V

    .line 113
    .line 114
    .line 115
    iget-object v1, v0, Lk0/t0;->t:Lk0/x0;

    .line 116
    .line 117
    invoke-interface {v1, v2}, Lk0/x0;->c(Lk0/x0$a;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    iget-object v5, v0, Lk0/t0;->G:Lk0/E0;

    .line 122
    .line 123
    invoke-virtual {v5}, Lk0/E0;->t()Lk0/B0;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    if-nez v1, :cond_4

    .line 128
    .line 129
    iget-boolean v6, v5, Lk0/B0;->d:Z

    .line 130
    .line 131
    if-eqz v6, :cond_4

    .line 132
    .line 133
    const-wide/32 v6, 0x7a120

    .line 134
    .line 135
    .line 136
    cmp-long v3, v3, v6

    .line 137
    .line 138
    if-gez v3, :cond_4

    .line 139
    .line 140
    iget-wide v3, v0, Lk0/t0;->A:J

    .line 141
    .line 142
    const-wide/16 v6, 0x0

    .line 143
    .line 144
    cmp-long v3, v3, v6

    .line 145
    .line 146
    if-gtz v3, :cond_3

    .line 147
    .line 148
    iget-boolean v3, v0, Lk0/t0;->B:Z

    .line 149
    .line 150
    if-eqz v3, :cond_4

    .line 151
    .line 152
    :cond_3
    iget-object v1, v5, Lk0/B0;->a:Lx0/v;

    .line 153
    .line 154
    iget-object v3, v0, Lk0/t0;->N:Lk0/U0;

    .line 155
    .line 156
    iget-wide v3, v3, Lk0/U0;->s:J

    .line 157
    .line 158
    const/4 v5, 0x0

    .line 159
    invoke-interface {v1, v3, v4, v5}, Lx0/v;->q(JZ)V

    .line 160
    .line 161
    .line 162
    iget-object v1, v0, Lk0/t0;->t:Lk0/x0;

    .line 163
    .line 164
    invoke-interface {v1, v2}, Lk0/x0;->c(Lk0/x0$a;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    :cond_4
    return v1
.end method

.method public final o0(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lk0/B0;->p()LA0/E;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, LA0/E;->c:[LA0/y;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4, p1}, LA0/y;->h(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lk0/B0;->k()Lk0/B0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method public final o1()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lk0/U0;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lk0/U0;->n:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return v0
.end method

.method public final p0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lk0/B0;->p()LA0/E;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, LA0/E;->c:[LA0/y;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4}, LA0/y;->u()V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lk0/B0;->k()Lk0/B0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
.end method

.method public final p1(Z)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lk0/t0;->a0:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->Y()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    return v1

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object v2, v0, Lk0/t0;->N:Lk0/U0;

    .line 17
    .line 18
    iget-boolean v2, v2, Lk0/U0;->g:Z

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    return v3

    .line 24
    :cond_2
    iget-object v2, v0, Lk0/t0;->G:Lk0/E0;

    .line 25
    .line 26
    invoke-virtual {v2}, Lk0/E0;->t()Lk0/B0;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v4, v0, Lk0/t0;->N:Lk0/U0;

    .line 31
    .line 32
    iget-object v4, v4, Lk0/U0;->a:Ld0/I;

    .line 33
    .line 34
    iget-object v5, v2, Lk0/B0;->f:Lk0/C0;

    .line 35
    .line 36
    iget-object v5, v5, Lk0/C0;->a:Lx0/x$b;

    .line 37
    .line 38
    invoke-virtual {v0, v4, v5}, Lk0/t0;->q1(Ld0/I;Lx0/x$b;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    iget-object v4, v0, Lk0/t0;->I:Lk0/w0;

    .line 45
    .line 46
    invoke-interface {v4}, Lk0/w0;->e()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    :goto_0
    move-wide/from16 v17, v4

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    iget-object v4, v0, Lk0/t0;->G:Lk0/E0;

    .line 60
    .line 61
    invoke-virtual {v4}, Lk0/E0;->m()Lk0/B0;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Lk0/B0;->s()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_4

    .line 70
    .line 71
    iget-object v5, v4, Lk0/B0;->f:Lk0/C0;

    .line 72
    .line 73
    iget-boolean v5, v5, Lk0/C0;->i:Z

    .line 74
    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    move v5, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move v5, v1

    .line 80
    :goto_2
    iget-object v6, v4, Lk0/B0;->f:Lk0/C0;

    .line 81
    .line 82
    iget-object v6, v6, Lk0/C0;->a:Lx0/x$b;

    .line 83
    .line 84
    invoke-virtual {v6}, Lx0/x$b;->b()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_5

    .line 89
    .line 90
    iget-boolean v4, v4, Lk0/B0;->d:Z

    .line 91
    .line 92
    if-nez v4, :cond_5

    .line 93
    .line 94
    move v4, v3

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    move v4, v1

    .line 97
    :goto_3
    if-nez v5, :cond_6

    .line 98
    .line 99
    if-nez v4, :cond_6

    .line 100
    .line 101
    iget-object v4, v0, Lk0/t0;->t:Lk0/x0;

    .line 102
    .line 103
    new-instance v5, Lk0/x0$a;

    .line 104
    .line 105
    iget-object v7, v0, Lk0/t0;->K:Ll0/y1;

    .line 106
    .line 107
    iget-object v6, v0, Lk0/t0;->N:Lk0/U0;

    .line 108
    .line 109
    iget-object v8, v6, Lk0/U0;->a:Ld0/I;

    .line 110
    .line 111
    iget-object v6, v2, Lk0/B0;->f:Lk0/C0;

    .line 112
    .line 113
    iget-object v9, v6, Lk0/C0;->a:Lx0/x$b;

    .line 114
    .line 115
    iget-wide v10, v0, Lk0/t0;->c0:J

    .line 116
    .line 117
    invoke-virtual {v2, v10, v11}, Lk0/B0;->A(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v10

    .line 121
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->J()J

    .line 122
    .line 123
    .line 124
    move-result-wide v12

    .line 125
    iget-object v2, v0, Lk0/t0;->C:Lk0/s;

    .line 126
    .line 127
    invoke-virtual {v2}, Lk0/s;->h()Ld0/C;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget v14, v2, Ld0/C;->a:F

    .line 132
    .line 133
    iget-object v2, v0, Lk0/t0;->N:Lk0/U0;

    .line 134
    .line 135
    iget-boolean v15, v2, Lk0/U0;->l:Z

    .line 136
    .line 137
    iget-boolean v2, v0, Lk0/t0;->S:Z

    .line 138
    .line 139
    move-object v6, v5

    .line 140
    move/from16 v16, v2

    .line 141
    .line 142
    invoke-direct/range {v6 .. v18}, Lk0/x0$a;-><init>(Ll0/y1;Ld0/I;Lx0/x$b;JJFZZJ)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v4, v5}, Lk0/x0;->e(Lk0/x0$a;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_7

    .line 150
    .line 151
    :cond_6
    move v1, v3

    .line 152
    :cond_7
    return v1
.end method

.method public final q(Lk0/t0$b;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lk0/t0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lk0/t0;->H:Lk0/T0;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne p2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lk0/T0;->r()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    :cond_0
    invoke-static {p1}, Lk0/t0$b;->b(Lk0/t0$b;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p1}, Lk0/t0$b;->c(Lk0/t0$b;)Lx0/T;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p2, v1, p1}, Lk0/T0;->f(ILjava/util/List;Lx0/T;)Ld0/I;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p0, p1, p2}, Lk0/t0;->O(Ld0/I;Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public q0(Lx0/v;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lg0/k;->g(ILjava/lang/Object;)Lg0/k$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lg0/k$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final q1(Ld0/I;Lx0/x$b;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Lx0/x$b;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Ld0/I;->q()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p2, p2, Lx0/x$b;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, Lk0/t0;->z:Ld0/I$b;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Ld0/I;->h(Ljava/lang/Object;Ld0/I$b;)Ld0/I$b;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget p2, p2, Ld0/I$b;->c:I

    .line 24
    .line 25
    iget-object v0, p0, Lk0/t0;->y:Ld0/I$c;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Ld0/I;->n(ILd0/I$c;)Ld0/I$c;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lk0/t0;->y:Ld0/I$c;

    .line 31
    .line 32
    invoke-virtual {p1}, Ld0/I$c;->f()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lk0/t0;->y:Ld0/I$c;

    .line 39
    .line 40
    iget-boolean p2, p1, Ld0/I$c;->i:Z

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    iget-wide p1, p1, Ld0/I$c;->f:J

    .line 45
    .line 46
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    cmp-long p1, p1, v2

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    :cond_1
    :goto_0
    return v1
.end method

.method public final r()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lk0/B0;->p()LA0/E;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 13
    .line 14
    array-length v2, v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LA0/E;->c(I)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 24
    .line 25
    aget-object v2, v2, v1

    .line 26
    .line 27
    invoke-interface {v2}, Lk0/Y0;->j()V

    .line 28
    .line 29
    .line 30
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public r0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lg0/k;->k(I)Lg0/k$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lg0/k$a;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final r1()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Lk0/B0;->p()LA0/E;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 16
    .line 17
    array-length v2, v2

    .line 18
    if-ge v1, v2, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0, v1}, LA0/E;->c(I)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 27
    .line 28
    aget-object v2, v2, v1

    .line 29
    .line 30
    invoke-interface {v2}, Lk0/Y0;->getState()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 38
    .line 39
    aget-object v2, v2, v1

    .line 40
    .line 41
    invoke-interface {v2}, Lk0/Y0;->start()V

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return-void
.end method

.method public final s()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk0/t0;->z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final s0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lk0/t0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0, v0, v1}, Lk0/t0;->A0(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lk0/t0;->t:Lk0/x0;

    .line 12
    .line 13
    iget-object v1, p0, Lk0/t0;->K:Ll0/y1;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lk0/x0;->a(Ll0/y1;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 19
    .line 20
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 21
    .line 22
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x2

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v1

    .line 32
    :goto_0
    invoke-virtual {p0, v0}, Lk0/t0;->l1(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lk0/t0;->H:Lk0/T0;

    .line 36
    .line 37
    iget-object v2, p0, Lk0/t0;->u:LB0/e;

    .line 38
    .line 39
    invoke-interface {v2}, LB0/e;->a()Li0/y;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v2}, Lk0/T0;->w(Li0/y;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 47
    .line 48
    invoke-interface {v0, v1}, Lg0/k;->c(I)Z

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public s1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-interface {v0, v1}, Lg0/k;->k(I)Lg0/k$a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Lg0/k$a;->a()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final t(Lk0/C0;J)Lk0/B0;
    .locals 10

    .line 1
    new-instance v9, Lk0/B0;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/t0;->q:[Lk0/a1;

    .line 4
    .line 5
    iget-object v4, p0, Lk0/t0;->r:LA0/D;

    .line 6
    .line 7
    iget-object v0, p0, Lk0/t0;->t:Lk0/x0;

    .line 8
    .line 9
    invoke-interface {v0}, Lk0/x0;->i()LB0/b;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    iget-object v6, p0, Lk0/t0;->H:Lk0/T0;

    .line 14
    .line 15
    iget-object v8, p0, Lk0/t0;->s:LA0/E;

    .line 16
    .line 17
    move-object v0, v9

    .line 18
    move-wide v2, p2

    .line 19
    move-object v7, p1

    .line 20
    invoke-direct/range {v0 .. v8}, Lk0/B0;-><init>([Lk0/a1;JLA0/D;LB0/b;Lk0/T0;Lk0/C0;LA0/E;)V

    .line 21
    .line 22
    .line 23
    return-object v9
.end method

.method public declared-synchronized t0()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lk0/t0;->P:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lk0/t0;->x:Landroid/os/Looper;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lk0/t0;->v:Lg0/k;

    .line 20
    .line 21
    const/4 v1, 0x7

    .line 22
    invoke-interface {v0, v1}, Lg0/k;->c(I)Z

    .line 23
    .line 24
    .line 25
    new-instance v0, Lk0/q0;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lk0/q0;-><init>(Lk0/t0;)V

    .line 28
    .line 29
    .line 30
    iget-wide v1, p0, Lk0/t0;->J:J

    .line 31
    .line 32
    invoke-virtual {p0, v0, v1, v2}, Lk0/t0;->D1(LW2/s;J)V

    .line 33
    .line 34
    .line 35
    iget-boolean v0, p0, Lk0/t0;->P:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    monitor-exit p0

    .line 38
    return v0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    monitor-exit p0

    .line 42
    const/4 v0, 0x1

    .line 43
    return v0

    .line 44
    :goto_1
    monitor-exit p0

    .line 45
    throw v0
.end method

.method public final t1(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Lk0/t0;->X:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move p1, v0

    .line 13
    :goto_1
    invoke-virtual {p0, p1, v1, v0, v1}, Lk0/t0;->A0(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lk0/t0$e;->b(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lk0/t0;->t:Lk0/x0;

    .line 22
    .line 23
    iget-object p2, p0, Lk0/t0;->K:Ll0/y1;

    .line 24
    .line 25
    invoke-interface {p1, p2}, Lk0/x0;->g(Ll0/y1;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lk0/t0;->l1(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final u(Lk0/V0;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lk0/V0;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_0
    invoke-virtual {p1}, Lk0/V0;->g()Lk0/V0$b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Lk0/V0;->i()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Lk0/V0;->e()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v1, v2, v3}, Lk0/V0$b;->t(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lk0/V0;->k(Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    invoke-virtual {p1, v0}, Lk0/V0;->k(Z)V

    .line 30
    .line 31
    .line 32
    throw v1
.end method

.method public final u0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-virtual {p0, v1, v0, v1, v0}, Lk0/t0;->A0(ZZZZ)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lk0/t0;->v0()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lk0/t0;->t:Lk0/x0;

    .line 10
    .line 11
    iget-object v2, p0, Lk0/t0;->K:Ll0/y1;

    .line 12
    .line 13
    invoke-interface {v0, v2}, Lk0/x0;->d(Ll0/y1;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lk0/t0;->l1(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lk0/t0;->w:Landroid/os/HandlerThread;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 24
    .line 25
    .line 26
    :cond_0
    monitor-enter p0

    .line 27
    :try_start_1
    iput-boolean v1, p0, Lk0/t0;->P:Z

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 30
    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw v0

    .line 37
    :catchall_1
    move-exception v0

    .line 38
    iget-object v2, p0, Lk0/t0;->w:Landroid/os/HandlerThread;

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/os/HandlerThread;->quit()Z

    .line 43
    .line 44
    .line 45
    :cond_1
    monitor-enter p0

    .line 46
    :try_start_2
    iput-boolean v1, p0, Lk0/t0;->P:Z

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 49
    .line 50
    .line 51
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 52
    throw v0

    .line 53
    :catchall_2
    move-exception v0

    .line 54
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 55
    throw v0
.end method

.method public final u1()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk0/t0;->C:Lk0/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/s;->f()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-static {v3}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Lk0/t0;->A(Lk0/Y0;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    return-void
.end method

.method public final v(Lk0/Y0;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lk0/t0;->C:Lk0/s;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lk0/s;->a(Lk0/Y0;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lk0/t0;->A(Lk0/Y0;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lk0/Y0;->g()V

    .line 17
    .line 18
    .line 19
    iget p1, p0, Lk0/t0;->a0:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, -0x1

    .line 22
    .line 23
    iput p1, p0, Lk0/t0;->a0:I

    .line 24
    .line 25
    return-void
.end method

.method public final v0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lk0/t0;->q:[Lk0/a1;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-interface {v1}, Lk0/a1;->o()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 15
    .line 16
    aget-object v1, v1, v0

    .line 17
    .line 18
    invoke-interface {v1}, Lk0/Y0;->release()V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public final v1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->m()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Lk0/t0;->U:Z

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lk0/B0;->a:Lx0/v;

    .line 14
    .line 15
    invoke-interface {v0}, Lx0/v;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    :goto_1
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 26
    .line 27
    iget-boolean v2, v1, Lk0/U0;->g:Z

    .line 28
    .line 29
    if-eq v0, v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lk0/U0;->b(Z)Lk0/U0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public final w()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lk0/t0;->E:Lg0/c;

    .line 4
    .line 5
    invoke-interface {v1}, Lg0/c;->d()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    iget-object v3, v0, Lk0/t0;->v:Lg0/k;

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    invoke-interface {v3, v4}, Lg0/k;->f(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->y1()V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, Lk0/t0;->N:Lk0/U0;

    .line 19
    .line 20
    iget v3, v3, Lk0/U0;->e:I

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    if-eq v3, v5, :cond_20

    .line 24
    .line 25
    const/4 v6, 0x4

    .line 26
    if-ne v3, v6, :cond_0

    .line 27
    .line 28
    goto/16 :goto_11

    .line 29
    .line 30
    :cond_0
    iget-object v3, v0, Lk0/t0;->G:Lk0/E0;

    .line 31
    .line 32
    invoke-virtual {v3}, Lk0/E0;->t()Lk0/B0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lk0/t0;->J0(J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    const-string v7, "doSomeWork"

    .line 43
    .line 44
    invoke-static {v7}, Lg0/F;->a(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->z1()V

    .line 48
    .line 49
    .line 50
    iget-boolean v7, v3, Lk0/B0;->d:Z

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    if-eqz v7, :cond_a

    .line 54
    .line 55
    iget-object v7, v0, Lk0/t0;->E:Lg0/c;

    .line 56
    .line 57
    invoke-interface {v7}, Lg0/c;->b()J

    .line 58
    .line 59
    .line 60
    move-result-wide v9

    .line 61
    invoke-static {v9, v10}, Lg0/M;->J0(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v9

    .line 65
    iput-wide v9, v0, Lk0/t0;->d0:J

    .line 66
    .line 67
    iget-object v7, v3, Lk0/B0;->a:Lx0/v;

    .line 68
    .line 69
    iget-object v9, v0, Lk0/t0;->N:Lk0/U0;

    .line 70
    .line 71
    iget-wide v9, v9, Lk0/U0;->s:J

    .line 72
    .line 73
    iget-wide v11, v0, Lk0/t0;->A:J

    .line 74
    .line 75
    sub-long/2addr v9, v11

    .line 76
    iget-boolean v11, v0, Lk0/t0;->B:Z

    .line 77
    .line 78
    invoke-interface {v7, v9, v10, v11}, Lx0/v;->q(JZ)V

    .line 79
    .line 80
    .line 81
    move v9, v5

    .line 82
    move v10, v9

    .line 83
    move v7, v8

    .line 84
    :goto_0
    iget-object v11, v0, Lk0/t0;->o:[Lk0/Y0;

    .line 85
    .line 86
    array-length v12, v11

    .line 87
    if-ge v7, v12, :cond_b

    .line 88
    .line 89
    aget-object v11, v11, v7

    .line 90
    .line 91
    invoke-static {v11}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    if-nez v12, :cond_2

    .line 96
    .line 97
    goto :goto_7

    .line 98
    :cond_2
    iget-wide v12, v0, Lk0/t0;->c0:J

    .line 99
    .line 100
    iget-wide v14, v0, Lk0/t0;->d0:J

    .line 101
    .line 102
    invoke-interface {v11, v12, v13, v14, v15}, Lk0/Y0;->f(JJ)V

    .line 103
    .line 104
    .line 105
    if-eqz v9, :cond_3

    .line 106
    .line 107
    invoke-interface {v11}, Lk0/Y0;->c()Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-eqz v9, :cond_3

    .line 112
    .line 113
    move v9, v5

    .line 114
    goto :goto_1

    .line 115
    :cond_3
    move v9, v8

    .line 116
    :goto_1
    iget-object v12, v3, Lk0/B0;->c:[Lx0/Q;

    .line 117
    .line 118
    aget-object v12, v12, v7

    .line 119
    .line 120
    invoke-interface {v11}, Lk0/Y0;->i()Lx0/Q;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    if-eq v12, v13, :cond_4

    .line 125
    .line 126
    move v12, v5

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    move v12, v8

    .line 129
    :goto_2
    if-nez v12, :cond_5

    .line 130
    .line 131
    invoke-interface {v11}, Lk0/Y0;->p()Z

    .line 132
    .line 133
    .line 134
    move-result v13

    .line 135
    if-eqz v13, :cond_5

    .line 136
    .line 137
    move v13, v5

    .line 138
    goto :goto_3

    .line 139
    :cond_5
    move v13, v8

    .line 140
    :goto_3
    if-nez v12, :cond_7

    .line 141
    .line 142
    if-nez v13, :cond_7

    .line 143
    .line 144
    invoke-interface {v11}, Lk0/Y0;->e()Z

    .line 145
    .line 146
    .line 147
    move-result v12

    .line 148
    if-nez v12, :cond_7

    .line 149
    .line 150
    invoke-interface {v11}, Lk0/Y0;->c()Z

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-eqz v12, :cond_6

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    move v12, v8

    .line 158
    goto :goto_5

    .line 159
    :cond_7
    :goto_4
    move v12, v5

    .line 160
    :goto_5
    if-eqz v10, :cond_8

    .line 161
    .line 162
    if-eqz v12, :cond_8

    .line 163
    .line 164
    move v10, v5

    .line 165
    goto :goto_6

    .line 166
    :cond_8
    move v10, v8

    .line 167
    :goto_6
    if-nez v12, :cond_9

    .line 168
    .line 169
    invoke-interface {v11}, Lk0/Y0;->v()V

    .line 170
    .line 171
    .line 172
    :cond_9
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_a
    iget-object v7, v3, Lk0/B0;->a:Lx0/v;

    .line 176
    .line 177
    invoke-interface {v7}, Lx0/v;->p()V

    .line 178
    .line 179
    .line 180
    move v9, v5

    .line 181
    move v10, v9

    .line 182
    :cond_b
    iget-object v7, v3, Lk0/B0;->f:Lk0/C0;

    .line 183
    .line 184
    iget-wide v11, v7, Lk0/C0;->e:J

    .line 185
    .line 186
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    if-eqz v9, :cond_d

    .line 192
    .line 193
    iget-boolean v7, v3, Lk0/B0;->d:Z

    .line 194
    .line 195
    if-eqz v7, :cond_d

    .line 196
    .line 197
    cmp-long v7, v11, v13

    .line 198
    .line 199
    if-eqz v7, :cond_c

    .line 200
    .line 201
    iget-object v7, v0, Lk0/t0;->N:Lk0/U0;

    .line 202
    .line 203
    iget-wide v13, v7, Lk0/U0;->s:J

    .line 204
    .line 205
    cmp-long v7, v11, v13

    .line 206
    .line 207
    if-gtz v7, :cond_d

    .line 208
    .line 209
    :cond_c
    move v7, v5

    .line 210
    goto :goto_8

    .line 211
    :cond_d
    move v7, v8

    .line 212
    :goto_8
    if-eqz v7, :cond_e

    .line 213
    .line 214
    iget-boolean v9, v0, Lk0/t0;->R:Z

    .line 215
    .line 216
    if-eqz v9, :cond_e

    .line 217
    .line 218
    iput-boolean v8, v0, Lk0/t0;->R:Z

    .line 219
    .line 220
    iget-object v9, v0, Lk0/t0;->N:Lk0/U0;

    .line 221
    .line 222
    iget v9, v9, Lk0/U0;->n:I

    .line 223
    .line 224
    const/4 v11, 0x5

    .line 225
    invoke-virtual {v0, v8, v9, v8, v11}, Lk0/t0;->b1(ZIZI)V

    .line 226
    .line 227
    .line 228
    :cond_e
    const/4 v9, 0x3

    .line 229
    if-eqz v7, :cond_10

    .line 230
    .line 231
    iget-object v7, v3, Lk0/B0;->f:Lk0/C0;

    .line 232
    .line 233
    iget-boolean v7, v7, Lk0/C0;->i:Z

    .line 234
    .line 235
    if-eqz v7, :cond_10

    .line 236
    .line 237
    invoke-virtual {v0, v6}, Lk0/t0;->l1(I)V

    .line 238
    .line 239
    .line 240
    :cond_f
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->u1()V

    .line 241
    .line 242
    .line 243
    goto :goto_a

    .line 244
    :cond_10
    iget-object v7, v0, Lk0/t0;->N:Lk0/U0;

    .line 245
    .line 246
    iget v7, v7, Lk0/U0;->e:I

    .line 247
    .line 248
    if-ne v7, v4, :cond_11

    .line 249
    .line 250
    invoke-virtual {v0, v10}, Lk0/t0;->p1(Z)Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-eqz v7, :cond_11

    .line 255
    .line 256
    invoke-virtual {v0, v9}, Lk0/t0;->l1(I)V

    .line 257
    .line 258
    .line 259
    const/4 v7, 0x0

    .line 260
    iput-object v7, v0, Lk0/t0;->g0:Lk0/u;

    .line 261
    .line 262
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->o1()Z

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    if-eqz v7, :cond_14

    .line 267
    .line 268
    invoke-virtual {v0, v8, v8}, Lk0/t0;->B1(ZZ)V

    .line 269
    .line 270
    .line 271
    iget-object v7, v0, Lk0/t0;->C:Lk0/s;

    .line 272
    .line 273
    invoke-virtual {v7}, Lk0/s;->e()V

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->r1()V

    .line 277
    .line 278
    .line 279
    goto :goto_a

    .line 280
    :cond_11
    iget-object v7, v0, Lk0/t0;->N:Lk0/U0;

    .line 281
    .line 282
    iget v7, v7, Lk0/U0;->e:I

    .line 283
    .line 284
    if-ne v7, v9, :cond_14

    .line 285
    .line 286
    iget v7, v0, Lk0/t0;->a0:I

    .line 287
    .line 288
    if-nez v7, :cond_12

    .line 289
    .line 290
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->Y()Z

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    if-eqz v7, :cond_13

    .line 295
    .line 296
    goto :goto_a

    .line 297
    :cond_12
    if-nez v10, :cond_14

    .line 298
    .line 299
    :cond_13
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->o1()Z

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    invoke-virtual {v0, v7, v8}, Lk0/t0;->B1(ZZ)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v4}, Lk0/t0;->l1(I)V

    .line 307
    .line 308
    .line 309
    iget-boolean v7, v0, Lk0/t0;->S:Z

    .line 310
    .line 311
    if-eqz v7, :cond_f

    .line 312
    .line 313
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->p0()V

    .line 314
    .line 315
    .line 316
    iget-object v7, v0, Lk0/t0;->I:Lk0/w0;

    .line 317
    .line 318
    invoke-interface {v7}, Lk0/w0;->a()V

    .line 319
    .line 320
    .line 321
    goto :goto_9

    .line 322
    :cond_14
    :goto_a
    iget-object v7, v0, Lk0/t0;->N:Lk0/U0;

    .line 323
    .line 324
    iget v7, v7, Lk0/U0;->e:I

    .line 325
    .line 326
    if-ne v7, v4, :cond_19

    .line 327
    .line 328
    move v7, v8

    .line 329
    :goto_b
    iget-object v10, v0, Lk0/t0;->o:[Lk0/Y0;

    .line 330
    .line 331
    array-length v11, v10

    .line 332
    if-ge v7, v11, :cond_16

    .line 333
    .line 334
    aget-object v10, v10, v7

    .line 335
    .line 336
    invoke-static {v10}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    if-eqz v10, :cond_15

    .line 341
    .line 342
    iget-object v10, v0, Lk0/t0;->o:[Lk0/Y0;

    .line 343
    .line 344
    aget-object v10, v10, v7

    .line 345
    .line 346
    invoke-interface {v10}, Lk0/Y0;->i()Lx0/Q;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    iget-object v11, v3, Lk0/B0;->c:[Lx0/Q;

    .line 351
    .line 352
    aget-object v11, v11, v7

    .line 353
    .line 354
    if-ne v10, v11, :cond_15

    .line 355
    .line 356
    iget-object v10, v0, Lk0/t0;->o:[Lk0/Y0;

    .line 357
    .line 358
    aget-object v10, v10, v7

    .line 359
    .line 360
    invoke-interface {v10}, Lk0/Y0;->v()V

    .line 361
    .line 362
    .line 363
    :cond_15
    add-int/lit8 v7, v7, 0x1

    .line 364
    .line 365
    goto :goto_b

    .line 366
    :cond_16
    iget-object v3, v0, Lk0/t0;->N:Lk0/U0;

    .line 367
    .line 368
    iget-boolean v7, v3, Lk0/U0;->g:Z

    .line 369
    .line 370
    if-nez v7, :cond_19

    .line 371
    .line 372
    iget-wide v10, v3, Lk0/U0;->r:J

    .line 373
    .line 374
    const-wide/32 v12, 0x7a120

    .line 375
    .line 376
    .line 377
    cmp-long v3, v10, v12

    .line 378
    .line 379
    if-gez v3, :cond_19

    .line 380
    .line 381
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->W()Z

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-eqz v3, :cond_19

    .line 386
    .line 387
    iget-wide v10, v0, Lk0/t0;->i0:J

    .line 388
    .line 389
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    cmp-long v3, v10, v12

    .line 395
    .line 396
    if-nez v3, :cond_17

    .line 397
    .line 398
    iget-object v3, v0, Lk0/t0;->E:Lg0/c;

    .line 399
    .line 400
    invoke-interface {v3}, Lg0/c;->b()J

    .line 401
    .line 402
    .line 403
    move-result-wide v10

    .line 404
    :goto_c
    iput-wide v10, v0, Lk0/t0;->i0:J

    .line 405
    .line 406
    goto :goto_d

    .line 407
    :cond_17
    iget-object v3, v0, Lk0/t0;->E:Lg0/c;

    .line 408
    .line 409
    invoke-interface {v3}, Lg0/c;->b()J

    .line 410
    .line 411
    .line 412
    move-result-wide v10

    .line 413
    iget-wide v12, v0, Lk0/t0;->i0:J

    .line 414
    .line 415
    sub-long/2addr v10, v12

    .line 416
    const-wide/16 v12, 0xfa0

    .line 417
    .line 418
    cmp-long v3, v10, v12

    .line 419
    .line 420
    if-gez v3, :cond_18

    .line 421
    .line 422
    goto :goto_d

    .line 423
    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 424
    .line 425
    const-string v2, "Playback stuck buffering and not loading"

    .line 426
    .line 427
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v1

    .line 431
    :cond_19
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    goto :goto_c

    .line 437
    :goto_d
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->o1()Z

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    if-eqz v3, :cond_1a

    .line 442
    .line 443
    iget-object v3, v0, Lk0/t0;->N:Lk0/U0;

    .line 444
    .line 445
    iget v3, v3, Lk0/U0;->e:I

    .line 446
    .line 447
    if-ne v3, v9, :cond_1a

    .line 448
    .line 449
    move v3, v5

    .line 450
    goto :goto_e

    .line 451
    :cond_1a
    move v3, v8

    .line 452
    :goto_e
    iget-boolean v7, v0, Lk0/t0;->Z:Z

    .line 453
    .line 454
    if-eqz v7, :cond_1b

    .line 455
    .line 456
    iget-boolean v7, v0, Lk0/t0;->Y:Z

    .line 457
    .line 458
    if-eqz v7, :cond_1b

    .line 459
    .line 460
    if-eqz v3, :cond_1b

    .line 461
    .line 462
    goto :goto_f

    .line 463
    :cond_1b
    move v5, v8

    .line 464
    :goto_f
    iget-object v7, v0, Lk0/t0;->N:Lk0/U0;

    .line 465
    .line 466
    iget-boolean v10, v7, Lk0/U0;->p:Z

    .line 467
    .line 468
    if-eq v10, v5, :cond_1c

    .line 469
    .line 470
    invoke-virtual {v7, v5}, Lk0/U0;->i(Z)Lk0/U0;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    iput-object v7, v0, Lk0/t0;->N:Lk0/U0;

    .line 475
    .line 476
    :cond_1c
    iput-boolean v8, v0, Lk0/t0;->Y:Z

    .line 477
    .line 478
    if-nez v5, :cond_1f

    .line 479
    .line 480
    iget-object v5, v0, Lk0/t0;->N:Lk0/U0;

    .line 481
    .line 482
    iget v5, v5, Lk0/U0;->e:I

    .line 483
    .line 484
    if-ne v5, v6, :cond_1d

    .line 485
    .line 486
    goto :goto_10

    .line 487
    :cond_1d
    if-nez v3, :cond_1e

    .line 488
    .line 489
    if-eq v5, v4, :cond_1e

    .line 490
    .line 491
    if-ne v5, v9, :cond_1f

    .line 492
    .line 493
    iget v3, v0, Lk0/t0;->a0:I

    .line 494
    .line 495
    if-eqz v3, :cond_1f

    .line 496
    .line 497
    :cond_1e
    invoke-virtual {v0, v1, v2}, Lk0/t0;->J0(J)V

    .line 498
    .line 499
    .line 500
    :cond_1f
    :goto_10
    invoke-static {}, Lg0/F;->b()V

    .line 501
    .line 502
    .line 503
    :cond_20
    :goto_11
    return-void
.end method

.method public final w0(IILx0/T;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lk0/t0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lk0/t0;->H:Lk0/T0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lk0/T0;->A(IILx0/T;)Ld0/I;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-virtual {p0, p1, p2}, Lk0/t0;->O(Ld0/I;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final w1(Lx0/x$b;Lx0/Z;LA0/E;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lk0/t0;->t:Lk0/x0;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/t0;->K:Ll0/y1;

    .line 4
    .line 5
    iget-object v2, p0, Lk0/t0;->N:Lk0/U0;

    .line 6
    .line 7
    iget-object v2, v2, Lk0/U0;->a:Ld0/I;

    .line 8
    .line 9
    iget-object v4, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 10
    .line 11
    iget-object v6, p3, LA0/E;->c:[LA0/y;

    .line 12
    .line 13
    move-object v3, p1

    .line 14
    move-object v5, p2

    .line 15
    invoke-interface/range {v0 .. v6}, Lk0/x0;->b(Ll0/y1;Ld0/I;Lx0/x$b;[Lk0/Y0;Lx0/Z;[LA0/y;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final x(IZJ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lk0/t0;->o:[Lk0/Y0;

    .line 4
    .line 5
    aget-object v1, v1, p1

    .line 6
    .line 7
    invoke-static {v1}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v2, v0, Lk0/t0;->G:Lk0/E0;

    .line 15
    .line 16
    invoke-virtual {v2}, Lk0/E0;->u()Lk0/B0;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, v0, Lk0/t0;->G:Lk0/E0;

    .line 21
    .line 22
    invoke-virtual {v3}, Lk0/E0;->t()Lk0/B0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x1

    .line 28
    if-ne v2, v3, :cond_1

    .line 29
    .line 30
    move v15, v5

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v15, v4

    .line 33
    :goto_0
    invoke-virtual {v2}, Lk0/B0;->p()LA0/E;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v6, v3, LA0/E;->b:[Lk0/b1;

    .line 38
    .line 39
    aget-object v6, v6, p1

    .line 40
    .line 41
    iget-object v3, v3, LA0/E;->c:[LA0/y;

    .line 42
    .line 43
    aget-object v3, v3, p1

    .line 44
    .line 45
    invoke-static {v3}, Lk0/t0;->E(LA0/y;)[Ld0/q;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->o1()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    iget-object v3, v0, Lk0/t0;->N:Lk0/U0;

    .line 56
    .line 57
    iget v3, v3, Lk0/U0;->e:I

    .line 58
    .line 59
    const/4 v8, 0x3

    .line 60
    if-ne v3, v8, :cond_2

    .line 61
    .line 62
    move/from16 v16, v5

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move/from16 v16, v4

    .line 66
    .line 67
    :goto_1
    if-nez p2, :cond_3

    .line 68
    .line 69
    if-eqz v16, :cond_3

    .line 70
    .line 71
    move v8, v5

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    move v8, v4

    .line 74
    :goto_2
    iget v3, v0, Lk0/t0;->a0:I

    .line 75
    .line 76
    add-int/2addr v3, v5

    .line 77
    iput v3, v0, Lk0/t0;->a0:I

    .line 78
    .line 79
    iget-object v3, v0, Lk0/t0;->p:Ljava/util/Set;

    .line 80
    .line 81
    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-object v3, v2, Lk0/B0;->c:[Lx0/Q;

    .line 85
    .line 86
    aget-object v5, v3, p1

    .line 87
    .line 88
    iget-wide v9, v0, Lk0/t0;->c0:J

    .line 89
    .line 90
    invoke-virtual {v2}, Lk0/B0;->m()J

    .line 91
    .line 92
    .line 93
    move-result-wide v12

    .line 94
    iget-object v2, v2, Lk0/B0;->f:Lk0/C0;

    .line 95
    .line 96
    iget-object v14, v2, Lk0/C0;->a:Lx0/x$b;

    .line 97
    .line 98
    move-object v2, v1

    .line 99
    move-object v3, v6

    .line 100
    move-object v4, v7

    .line 101
    move-wide v6, v9

    .line 102
    move v9, v15

    .line 103
    move-wide/from16 v10, p3

    .line 104
    .line 105
    invoke-interface/range {v2 .. v14}, Lk0/Y0;->C(Lk0/b1;[Ld0/q;Lx0/Q;JZZJJLx0/x$b;)V

    .line 106
    .line 107
    .line 108
    new-instance v2, Lk0/t0$a;

    .line 109
    .line 110
    invoke-direct {v2, v0}, Lk0/t0$a;-><init>(Lk0/t0;)V

    .line 111
    .line 112
    .line 113
    const/16 v3, 0xb

    .line 114
    .line 115
    invoke-interface {v1, v3, v2}, Lk0/V0$b;->t(ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object v2, v0, Lk0/t0;->C:Lk0/s;

    .line 119
    .line 120
    invoke-virtual {v2, v1}, Lk0/s;->b(Lk0/Y0;)V

    .line 121
    .line 122
    .line 123
    if-eqz v16, :cond_4

    .line 124
    .line 125
    if-eqz v15, :cond_4

    .line 126
    .line 127
    invoke-interface {v1}, Lk0/Y0;->start()V

    .line 128
    .line 129
    .line 130
    :cond_4
    return-void
.end method

.method public final x0()Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lk0/t0;->G:Lk0/E0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lk0/E0;->u()Lk0/B0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lk0/B0;->p()LA0/E;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    move v5, v4

    .line 16
    :goto_0
    iget-object v6, v0, Lk0/t0;->o:[Lk0/Y0;

    .line 17
    .line 18
    array-length v7, v6

    .line 19
    const/4 v8, 0x1

    .line 20
    if-ge v4, v7, :cond_6

    .line 21
    .line 22
    aget-object v9, v6, v4

    .line 23
    .line 24
    invoke-static {v9}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-interface {v9}, Lk0/Y0;->i()Lx0/Q;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v7, v1, Lk0/B0;->c:[Lx0/Q;

    .line 36
    .line 37
    aget-object v7, v7, v4

    .line 38
    .line 39
    if-eq v6, v7, :cond_1

    .line 40
    .line 41
    move v6, v8

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v6, v3

    .line 44
    :goto_1
    invoke-virtual {v2, v4}, LA0/E;->c(I)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_2

    .line 49
    .line 50
    if-nez v6, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-interface {v9}, Lk0/Y0;->A()Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-nez v6, :cond_3

    .line 58
    .line 59
    iget-object v6, v2, LA0/E;->c:[LA0/y;

    .line 60
    .line 61
    aget-object v6, v6, v4

    .line 62
    .line 63
    invoke-static {v6}, Lk0/t0;->E(LA0/y;)[Ld0/q;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    iget-object v6, v1, Lk0/B0;->c:[Lx0/Q;

    .line 68
    .line 69
    aget-object v11, v6, v4

    .line 70
    .line 71
    invoke-virtual {v1}, Lk0/B0;->n()J

    .line 72
    .line 73
    .line 74
    move-result-wide v12

    .line 75
    invoke-virtual {v1}, Lk0/B0;->m()J

    .line 76
    .line 77
    .line 78
    move-result-wide v14

    .line 79
    iget-object v6, v1, Lk0/B0;->f:Lk0/C0;

    .line 80
    .line 81
    iget-object v6, v6, Lk0/C0;->a:Lx0/x$b;

    .line 82
    .line 83
    move-object/from16 v16, v6

    .line 84
    .line 85
    invoke-interface/range {v9 .. v16}, Lk0/Y0;->F([Ld0/q;Lx0/Q;JJLx0/x$b;)V

    .line 86
    .line 87
    .line 88
    iget-boolean v6, v0, Lk0/t0;->Z:Z

    .line 89
    .line 90
    if-eqz v6, :cond_5

    .line 91
    .line 92
    invoke-virtual {v0, v3}, Lk0/t0;->Y0(Z)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    invoke-interface {v9}, Lk0/Y0;->c()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_4

    .line 101
    .line 102
    invoke-virtual {v0, v9}, Lk0/t0;->v(Lk0/Y0;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    move v5, v8

    .line 107
    :cond_5
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    xor-int/lit8 v1, v5, 0x1

    .line 111
    .line 112
    return v1
.end method

.method public final x1(IILjava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lk0/t0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lk0/t0;->H:Lk0/T0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lk0/T0;->E(IILjava/util/List;)Ld0/I;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-virtual {p0, p1, p2}, Lk0/t0;->O(Ld0/I;Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final y()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    new-array v0, v0, [Z

    .line 5
    .line 6
    iget-object v1, p0, Lk0/t0;->G:Lk0/E0;

    .line 7
    .line 8
    invoke-virtual {v1}, Lk0/E0;->u()Lk0/B0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lk0/B0;->n()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-virtual {p0, v0, v1, v2}, Lk0/t0;->z([ZJ)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final y0()V
    .locals 18

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    iget-object v0, v10, Lk0/t0;->C:Lk0/s;

    .line 4
    .line 5
    invoke-virtual {v0}, Lk0/s;->h()Ld0/C;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Ld0/C;->a:F

    .line 10
    .line 11
    iget-object v1, v10, Lk0/t0;->G:Lk0/E0;

    .line 12
    .line 13
    invoke-virtual {v1}, Lk0/E0;->t()Lk0/B0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v10, Lk0/t0;->G:Lk0/E0;

    .line 18
    .line 19
    invoke-virtual {v2}, Lk0/E0;->u()Lk0/B0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x1

    .line 25
    :goto_0
    if-eqz v1, :cond_c

    .line 26
    .line 27
    iget-boolean v5, v1, Lk0/B0;->d:Z

    .line 28
    .line 29
    if-nez v5, :cond_0

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_0
    iget-object v5, v10, Lk0/t0;->N:Lk0/U0;

    .line 34
    .line 35
    iget-object v5, v5, Lk0/U0;->a:Ld0/I;

    .line 36
    .line 37
    invoke-virtual {v1, v0, v5}, Lk0/B0;->x(FLd0/I;)LA0/E;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget-object v6, v10, Lk0/t0;->G:Lk0/E0;

    .line 42
    .line 43
    invoke-virtual {v6}, Lk0/E0;->t()Lk0/B0;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    if-ne v1, v6, :cond_1

    .line 48
    .line 49
    move-object v3, v5

    .line 50
    :cond_1
    invoke-virtual {v1}, Lk0/B0;->p()LA0/E;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v5, v6}, LA0/E;->a(LA0/E;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_a

    .line 59
    .line 60
    const/4 v13, 0x4

    .line 61
    iget-object v0, v10, Lk0/t0;->G:Lk0/E0;

    .line 62
    .line 63
    if-eqz v4, :cond_8

    .line 64
    .line 65
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 66
    .line 67
    .line 68
    move-result-object v14

    .line 69
    iget-object v0, v10, Lk0/t0;->G:Lk0/E0;

    .line 70
    .line 71
    invoke-virtual {v0, v14}, Lk0/E0;->I(Lk0/B0;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    iget-object v0, v10, Lk0/t0;->o:[Lk0/Y0;

    .line 76
    .line 77
    array-length v0, v0

    .line 78
    new-array v15, v0, [Z

    .line 79
    .line 80
    invoke-static {v3}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move-object v5, v0

    .line 85
    check-cast v5, LA0/E;

    .line 86
    .line 87
    iget-object v0, v10, Lk0/t0;->N:Lk0/U0;

    .line 88
    .line 89
    iget-wide v6, v0, Lk0/U0;->s:J

    .line 90
    .line 91
    move-object v4, v14

    .line 92
    move-object v9, v15

    .line 93
    invoke-virtual/range {v4 .. v9}, Lk0/B0;->b(LA0/E;JZ[Z)J

    .line 94
    .line 95
    .line 96
    move-result-wide v8

    .line 97
    iget-object v0, v10, Lk0/t0;->N:Lk0/U0;

    .line 98
    .line 99
    iget v1, v0, Lk0/U0;->e:I

    .line 100
    .line 101
    if-eq v1, v13, :cond_2

    .line 102
    .line 103
    iget-wide v0, v0, Lk0/U0;->s:J

    .line 104
    .line 105
    cmp-long v0, v8, v0

    .line 106
    .line 107
    if-eqz v0, :cond_2

    .line 108
    .line 109
    const/16 v16, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    const/16 v16, 0x0

    .line 113
    .line 114
    :goto_1
    iget-object v0, v10, Lk0/t0;->N:Lk0/U0;

    .line 115
    .line 116
    iget-object v1, v0, Lk0/U0;->b:Lx0/x$b;

    .line 117
    .line 118
    iget-wide v4, v0, Lk0/U0;->c:J

    .line 119
    .line 120
    iget-wide v6, v0, Lk0/U0;->d:J

    .line 121
    .line 122
    const/16 v17, 0x5

    .line 123
    .line 124
    move-object/from16 v0, p0

    .line 125
    .line 126
    move-wide v2, v8

    .line 127
    move-wide v11, v8

    .line 128
    move/from16 v8, v16

    .line 129
    .line 130
    move/from16 v9, v17

    .line 131
    .line 132
    invoke-virtual/range {v0 .. v9}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iput-object v0, v10, Lk0/t0;->N:Lk0/U0;

    .line 137
    .line 138
    if-eqz v16, :cond_3

    .line 139
    .line 140
    invoke-virtual {v10, v11, v12}, Lk0/t0;->C0(J)V

    .line 141
    .line 142
    .line 143
    :cond_3
    iget-object v0, v10, Lk0/t0;->o:[Lk0/Y0;

    .line 144
    .line 145
    array-length v0, v0

    .line 146
    new-array v0, v0, [Z

    .line 147
    .line 148
    const/4 v12, 0x0

    .line 149
    :goto_2
    iget-object v1, v10, Lk0/t0;->o:[Lk0/Y0;

    .line 150
    .line 151
    array-length v2, v1

    .line 152
    if-ge v12, v2, :cond_6

    .line 153
    .line 154
    aget-object v1, v1, v12

    .line 155
    .line 156
    invoke-static {v1}, Lk0/t0;->X(Lk0/Y0;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    aput-boolean v2, v0, v12

    .line 161
    .line 162
    iget-object v3, v14, Lk0/B0;->c:[Lx0/Q;

    .line 163
    .line 164
    aget-object v3, v3, v12

    .line 165
    .line 166
    if-eqz v2, :cond_5

    .line 167
    .line 168
    invoke-interface {v1}, Lk0/Y0;->i()Lx0/Q;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    if-eq v3, v2, :cond_4

    .line 173
    .line 174
    invoke-virtual {v10, v1}, Lk0/t0;->v(Lk0/Y0;)V

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_4
    aget-boolean v2, v15, v12

    .line 179
    .line 180
    if-eqz v2, :cond_5

    .line 181
    .line 182
    iget-wide v2, v10, Lk0/t0;->c0:J

    .line 183
    .line 184
    invoke-interface {v1, v2, v3}, Lk0/Y0;->z(J)V

    .line 185
    .line 186
    .line 187
    :cond_5
    :goto_3
    add-int/lit8 v12, v12, 0x1

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    iget-wide v1, v10, Lk0/t0;->c0:J

    .line 191
    .line 192
    invoke-virtual {v10, v0, v1, v2}, Lk0/t0;->z([ZJ)V

    .line 193
    .line 194
    .line 195
    :cond_7
    :goto_4
    const/4 v5, 0x1

    .line 196
    goto :goto_5

    .line 197
    :cond_8
    invoke-virtual {v0, v1}, Lk0/E0;->I(Lk0/B0;)Z

    .line 198
    .line 199
    .line 200
    iget-boolean v0, v1, Lk0/B0;->d:Z

    .line 201
    .line 202
    if-eqz v0, :cond_7

    .line 203
    .line 204
    iget-object v0, v1, Lk0/B0;->f:Lk0/C0;

    .line 205
    .line 206
    iget-wide v2, v0, Lk0/C0;->b:J

    .line 207
    .line 208
    iget-wide v6, v10, Lk0/t0;->c0:J

    .line 209
    .line 210
    invoke-virtual {v1, v6, v7}, Lk0/B0;->A(J)J

    .line 211
    .line 212
    .line 213
    move-result-wide v6

    .line 214
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 215
    .line 216
    .line 217
    move-result-wide v2

    .line 218
    const/4 v6, 0x0

    .line 219
    invoke-virtual {v1, v5, v2, v3, v6}, Lk0/B0;->a(LA0/E;JZ)J

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :goto_5
    invoke-virtual {v10, v5}, Lk0/t0;->N(Z)V

    .line 224
    .line 225
    .line 226
    iget-object v0, v10, Lk0/t0;->N:Lk0/U0;

    .line 227
    .line 228
    iget v0, v0, Lk0/U0;->e:I

    .line 229
    .line 230
    if-eq v0, v13, :cond_9

    .line 231
    .line 232
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->c0()V

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {p0 .. p0}, Lk0/t0;->z1()V

    .line 236
    .line 237
    .line 238
    iget-object v0, v10, Lk0/t0;->v:Lg0/k;

    .line 239
    .line 240
    const/4 v1, 0x2

    .line 241
    invoke-interface {v0, v1}, Lg0/k;->c(I)Z

    .line 242
    .line 243
    .line 244
    :cond_9
    return-void

    .line 245
    :cond_a
    const/4 v5, 0x1

    .line 246
    const/4 v6, 0x0

    .line 247
    if-ne v1, v2, :cond_b

    .line 248
    .line 249
    move v4, v6

    .line 250
    :cond_b
    invoke-virtual {v1}, Lk0/B0;->k()Lk0/B0;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_c
    :goto_6
    return-void
.end method

.method public final y1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 2
    .line 3
    iget-object v0, v0, Lk0/U0;->a:Ld0/I;

    .line 4
    .line 5
    invoke-virtual {v0}, Ld0/I;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lk0/t0;->H:Lk0/T0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lk0/T0;->t()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lk0/t0;->f0()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Lk0/t0;->j0()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lk0/t0;->k0()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lk0/t0;->h0()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lk0/t0;->i0(Z)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public final z([ZJ)V
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->u()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lk0/B0;->p()LA0/E;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    iget-object v4, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 14
    .line 15
    array-length v4, v4

    .line 16
    if-ge v3, v4, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, v3}, LA0/E;->c(I)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    iget-object v4, p0, Lk0/t0;->p:Ljava/util/Set;

    .line 25
    .line 26
    iget-object v5, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 27
    .line 28
    aget-object v5, v5, v3

    .line 29
    .line 30
    invoke-interface {v4, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    iget-object v4, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 37
    .line 38
    aget-object v4, v4, v3

    .line 39
    .line 40
    invoke-interface {v4}, Lk0/Y0;->b()V

    .line 41
    .line 42
    .line 43
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :goto_1
    iget-object v3, p0, Lk0/t0;->o:[Lk0/Y0;

    .line 47
    .line 48
    array-length v3, v3

    .line 49
    if-ge v2, v3, :cond_3

    .line 50
    .line 51
    invoke-virtual {v1, v2}, LA0/E;->c(I)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    aget-boolean v3, p1, v2

    .line 58
    .line 59
    invoke-virtual {p0, v2, v3, p2, p3}, Lk0/t0;->x(IZJ)V

    .line 60
    .line 61
    .line 62
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    const/4 p1, 0x1

    .line 66
    iput-boolean p1, v0, Lk0/B0;->g:Z

    .line 67
    .line 68
    return-void
.end method

.method public final z0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk0/t0;->y0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Lk0/t0;->L0(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final z1()V
    .locals 11

    .line 1
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/E0;->t()Lk0/B0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-boolean v1, v0, Lk0/B0;->d:Z

    .line 11
    .line 12
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, v0, Lk0/B0;->a:Lx0/v;

    .line 20
    .line 21
    invoke-interface {v1}, Lx0/v;->l()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    move-wide v6, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-wide v6, v2

    .line 28
    :goto_0
    cmp-long v1, v6, v2

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0}, Lk0/B0;->s()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    iget-object v1, p0, Lk0/t0;->G:Lk0/E0;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lk0/E0;->I(Lk0/B0;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v10}, Lk0/t0;->N(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lk0/t0;->c0()V

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p0, v6, v7}, Lk0/t0;->C0(J)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 54
    .line 55
    iget-wide v0, v0, Lk0/U0;->s:J

    .line 56
    .line 57
    cmp-long v0, v6, v0

    .line 58
    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 62
    .line 63
    iget-object v1, v0, Lk0/U0;->b:Lx0/x$b;

    .line 64
    .line 65
    iget-wide v4, v0, Lk0/U0;->c:J

    .line 66
    .line 67
    const/4 v8, 0x1

    .line 68
    const/4 v9, 0x5

    .line 69
    :goto_1
    move-object v0, p0

    .line 70
    move-wide v2, v6

    .line 71
    invoke-virtual/range {v0 .. v9}, Lk0/t0;->S(Lx0/x$b;JJJZI)Lk0/U0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    iget-object v1, p0, Lk0/t0;->C:Lk0/s;

    .line 79
    .line 80
    iget-object v2, p0, Lk0/t0;->G:Lk0/E0;

    .line 81
    .line 82
    invoke-virtual {v2}, Lk0/E0;->u()Lk0/B0;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const/4 v3, 0x1

    .line 87
    if-eq v0, v2, :cond_4

    .line 88
    .line 89
    move v2, v3

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    move v2, v10

    .line 92
    :goto_2
    invoke-virtual {v1, v2}, Lk0/s;->g(Z)J

    .line 93
    .line 94
    .line 95
    move-result-wide v1

    .line 96
    iput-wide v1, p0, Lk0/t0;->c0:J

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Lk0/B0;->A(J)J

    .line 99
    .line 100
    .line 101
    move-result-wide v6

    .line 102
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 103
    .line 104
    iget-wide v0, v0, Lk0/U0;->s:J

    .line 105
    .line 106
    invoke-virtual {p0, v0, v1, v6, v7}, Lk0/t0;->e0(JJ)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lk0/t0;->C:Lk0/s;

    .line 110
    .line 111
    invoke-virtual {v0}, Lk0/s;->r()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    iget-object v0, p0, Lk0/t0;->O:Lk0/t0$e;

    .line 118
    .line 119
    iget-boolean v0, v0, Lk0/t0$e;->d:Z

    .line 120
    .line 121
    xor-int/lit8 v8, v0, 0x1

    .line 122
    .line 123
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 124
    .line 125
    iget-object v1, v0, Lk0/U0;->b:Lx0/x$b;

    .line 126
    .line 127
    iget-wide v4, v0, Lk0/U0;->c:J

    .line 128
    .line 129
    const/4 v9, 0x6

    .line 130
    goto :goto_1

    .line 131
    :cond_5
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 132
    .line 133
    invoke-virtual {v0, v6, v7}, Lk0/U0;->o(J)V

    .line 134
    .line 135
    .line 136
    :cond_6
    :goto_3
    iget-object v0, p0, Lk0/t0;->G:Lk0/E0;

    .line 137
    .line 138
    invoke-virtual {v0}, Lk0/E0;->m()Lk0/B0;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 143
    .line 144
    invoke-virtual {v0}, Lk0/B0;->j()J

    .line 145
    .line 146
    .line 147
    move-result-wide v2

    .line 148
    iput-wide v2, v1, Lk0/U0;->q:J

    .line 149
    .line 150
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 151
    .line 152
    invoke-virtual {p0}, Lk0/t0;->J()J

    .line 153
    .line 154
    .line 155
    move-result-wide v1

    .line 156
    iput-wide v1, v0, Lk0/U0;->r:J

    .line 157
    .line 158
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 159
    .line 160
    iget-boolean v1, v0, Lk0/U0;->l:Z

    .line 161
    .line 162
    if-eqz v1, :cond_7

    .line 163
    .line 164
    iget v1, v0, Lk0/U0;->e:I

    .line 165
    .line 166
    const/4 v2, 0x3

    .line 167
    if-ne v1, v2, :cond_7

    .line 168
    .line 169
    iget-object v1, v0, Lk0/U0;->a:Ld0/I;

    .line 170
    .line 171
    iget-object v0, v0, Lk0/U0;->b:Lx0/x$b;

    .line 172
    .line 173
    invoke-virtual {p0, v1, v0}, Lk0/t0;->q1(Ld0/I;Lx0/x$b;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_7

    .line 178
    .line 179
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 180
    .line 181
    iget-object v0, v0, Lk0/U0;->o:Ld0/C;

    .line 182
    .line 183
    iget v0, v0, Ld0/C;->a:F

    .line 184
    .line 185
    const/high16 v1, 0x3f800000    # 1.0f

    .line 186
    .line 187
    cmpl-float v0, v0, v1

    .line 188
    .line 189
    if-nez v0, :cond_7

    .line 190
    .line 191
    iget-object v0, p0, Lk0/t0;->I:Lk0/w0;

    .line 192
    .line 193
    invoke-virtual {p0}, Lk0/t0;->D()J

    .line 194
    .line 195
    .line 196
    move-result-wide v1

    .line 197
    invoke-virtual {p0}, Lk0/t0;->J()J

    .line 198
    .line 199
    .line 200
    move-result-wide v3

    .line 201
    invoke-interface {v0, v1, v2, v3, v4}, Lk0/w0;->c(JJ)F

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    iget-object v1, p0, Lk0/t0;->C:Lk0/s;

    .line 206
    .line 207
    invoke-virtual {v1}, Lk0/s;->h()Ld0/C;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    iget v1, v1, Ld0/C;->a:F

    .line 212
    .line 213
    cmpl-float v1, v1, v0

    .line 214
    .line 215
    if-eqz v1, :cond_7

    .line 216
    .line 217
    iget-object v1, p0, Lk0/t0;->N:Lk0/U0;

    .line 218
    .line 219
    iget-object v1, v1, Lk0/U0;->o:Ld0/C;

    .line 220
    .line 221
    invoke-virtual {v1, v0}, Ld0/C;->b(F)Ld0/C;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {p0, v0}, Lk0/t0;->V0(Ld0/C;)V

    .line 226
    .line 227
    .line 228
    iget-object v0, p0, Lk0/t0;->N:Lk0/U0;

    .line 229
    .line 230
    iget-object v0, v0, Lk0/U0;->o:Ld0/C;

    .line 231
    .line 232
    iget-object v1, p0, Lk0/t0;->C:Lk0/s;

    .line 233
    .line 234
    invoke-virtual {v1}, Lk0/s;->h()Ld0/C;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    iget v1, v1, Ld0/C;->a:F

    .line 239
    .line 240
    invoke-virtual {p0, v0, v1, v10, v10}, Lk0/t0;->Q(Ld0/C;FZZ)V

    .line 241
    .line 242
    .line 243
    :cond_7
    return-void
.end method
