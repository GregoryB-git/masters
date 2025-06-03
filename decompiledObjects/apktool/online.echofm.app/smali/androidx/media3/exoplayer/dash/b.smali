.class public final Landroidx/media3/exoplayer/dash/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/v;
.implements Lx0/S$a;
.implements Ly0/h$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/dash/b$a;
    }
.end annotation


# static fields
.field public static final M:Ljava/util/regex/Pattern;

.field public static final N:Ljava/util/regex/Pattern;


# instance fields
.field public final A:Landroidx/media3/exoplayer/dash/d;

.field public final B:Ljava/util/IdentityHashMap;

.field public final C:Lx0/E$a;

.field public final D:Lp0/v$a;

.field public final E:Ll0/y1;

.field public F:Lx0/v$a;

.field public G:[Ly0/h;

.field public H:[Ln0/j;

.field public I:Lx0/S;

.field public J:Lo0/c;

.field public K:I

.field public L:Ljava/util/List;

.field public final o:I

.field public final p:Landroidx/media3/exoplayer/dash/a$a;

.field public final q:Li0/y;

.field public final r:Lp0/x;

.field public final s:LB0/m;

.field public final t:Ln0/b;

.field public final u:J

.field public final v:LB0/o;

.field public final w:LB0/b;

.field public final x:Lx0/Z;

.field public final y:[Landroidx/media3/exoplayer/dash/b$a;

.field public final z:Lx0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "CC([1-4])=(.+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Landroidx/media3/exoplayer/dash/b;->M:Ljava/util/regex/Pattern;

    const-string v0, "([1-4])=lang:(\\w+)(,.+)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Landroidx/media3/exoplayer/dash/b;->N:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(ILo0/c;Ln0/b;ILandroidx/media3/exoplayer/dash/a$a;Li0/y;LB0/f;Lp0/x;Lp0/v$a;LB0/m;Lx0/E$a;JLB0/o;LB0/b;Lx0/j;Landroidx/media3/exoplayer/dash/d$b;Ll0/y1;)V
    .locals 9

    .line 1
    move-object v0, p0

    move-object v1, p2

    move v2, p4

    move-object v3, p5

    move-object/from16 v4, p8

    move-object/from16 v5, p15

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v6, p1

    iput v6, v0, Landroidx/media3/exoplayer/dash/b;->o:I

    iput-object v1, v0, Landroidx/media3/exoplayer/dash/b;->J:Lo0/c;

    move-object v6, p3

    iput-object v6, v0, Landroidx/media3/exoplayer/dash/b;->t:Ln0/b;

    iput v2, v0, Landroidx/media3/exoplayer/dash/b;->K:I

    iput-object v3, v0, Landroidx/media3/exoplayer/dash/b;->p:Landroidx/media3/exoplayer/dash/a$a;

    move-object v6, p6

    iput-object v6, v0, Landroidx/media3/exoplayer/dash/b;->q:Li0/y;

    iput-object v4, v0, Landroidx/media3/exoplayer/dash/b;->r:Lp0/x;

    move-object/from16 v6, p9

    iput-object v6, v0, Landroidx/media3/exoplayer/dash/b;->D:Lp0/v$a;

    move-object/from16 v6, p10

    iput-object v6, v0, Landroidx/media3/exoplayer/dash/b;->s:LB0/m;

    move-object/from16 v6, p11

    iput-object v6, v0, Landroidx/media3/exoplayer/dash/b;->C:Lx0/E$a;

    move-wide/from16 v6, p12

    iput-wide v6, v0, Landroidx/media3/exoplayer/dash/b;->u:J

    move-object/from16 v6, p14

    iput-object v6, v0, Landroidx/media3/exoplayer/dash/b;->v:LB0/o;

    iput-object v5, v0, Landroidx/media3/exoplayer/dash/b;->w:LB0/b;

    move-object/from16 v6, p16

    iput-object v6, v0, Landroidx/media3/exoplayer/dash/b;->z:Lx0/j;

    move-object/from16 v7, p18

    iput-object v7, v0, Landroidx/media3/exoplayer/dash/b;->E:Ll0/y1;

    new-instance v7, Landroidx/media3/exoplayer/dash/d;

    move-object/from16 v8, p17

    invoke-direct {v7, p2, v8, v5}, Landroidx/media3/exoplayer/dash/d;-><init>(Lo0/c;Landroidx/media3/exoplayer/dash/d$b;LB0/b;)V

    iput-object v7, v0, Landroidx/media3/exoplayer/dash/b;->A:Landroidx/media3/exoplayer/dash/d;

    const/4 v5, 0x0

    invoke-static {v5}, Landroidx/media3/exoplayer/dash/b;->I(I)[Ly0/h;

    move-result-object v7

    iput-object v7, v0, Landroidx/media3/exoplayer/dash/b;->G:[Ly0/h;

    new-array v5, v5, [Ln0/j;

    iput-object v5, v0, Landroidx/media3/exoplayer/dash/b;->H:[Ln0/j;

    new-instance v5, Ljava/util/IdentityHashMap;

    invoke-direct {v5}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v5, v0, Landroidx/media3/exoplayer/dash/b;->B:Ljava/util/IdentityHashMap;

    invoke-interface/range {p16 .. p16}, Lx0/j;->a()Lx0/S;

    move-result-object v5

    iput-object v5, v0, Landroidx/media3/exoplayer/dash/b;->I:Lx0/S;

    invoke-virtual {p2, p4}, Lo0/c;->d(I)Lo0/g;

    move-result-object v1

    iget-object v2, v1, Lo0/g;->d:Ljava/util/List;

    iput-object v2, v0, Landroidx/media3/exoplayer/dash/b;->L:Ljava/util/List;

    iget-object v1, v1, Lo0/g;->c:Ljava/util/List;

    invoke-static {v4, p5, v1, v2}, Landroidx/media3/exoplayer/dash/b;->w(Lp0/x;Landroidx/media3/exoplayer/dash/a$a;Ljava/util/List;Ljava/util/List;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lx0/Z;

    iput-object v2, v0, Landroidx/media3/exoplayer/dash/b;->x:Lx0/Z;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [Landroidx/media3/exoplayer/dash/b$a;

    iput-object v1, v0, Landroidx/media3/exoplayer/dash/b;->y:[Landroidx/media3/exoplayer/dash/b$a;

    return-void
.end method

.method public static A(Ljava/util/List;[I)[Ld0/q;
    .locals 9

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_3

    .line 5
    .line 6
    aget v3, p1, v2

    .line 7
    .line 8
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    check-cast v4, Lo0/a;

    .line 13
    .line 14
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lo0/a;

    .line 19
    .line 20
    iget-object v3, v3, Lo0/a;->d:Ljava/util/List;

    .line 21
    .line 22
    move v5, v1

    .line 23
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-ge v5, v6, :cond_2

    .line 28
    .line 29
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    check-cast v6, Lo0/e;

    .line 34
    .line 35
    iget-object v7, v6, Lo0/e;->a:Ljava/lang/String;

    .line 36
    .line 37
    const-string v8, "urn:scte:dash:cc:cea-608:2015"

    .line 38
    .line 39
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    new-instance p0, Ld0/q$b;

    .line 46
    .line 47
    invoke-direct {p0}, Ld0/q$b;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string p1, "application/cea-608"

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p1, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    iget-wide v0, v4, Lo0/a;->a:J

    .line 62
    .line 63
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v0, ":cea608"

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0, p1}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Ld0/q$b;->K()Ld0/q;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    sget-object p1, Landroidx/media3/exoplayer/dash/b;->M:Ljava/util/regex/Pattern;

    .line 84
    .line 85
    :goto_2
    invoke-static {v6, p1, p0}, Landroidx/media3/exoplayer/dash/b;->K(Lo0/e;Ljava/util/regex/Pattern;Ld0/q;)[Ld0/q;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :cond_0
    const-string v7, "urn:scte:dash:cc:cea-708:2015"

    .line 91
    .line 92
    iget-object v8, v6, Lo0/e;->a:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_1

    .line 99
    .line 100
    new-instance p0, Ld0/q$b;

    .line 101
    .line 102
    invoke-direct {p0}, Ld0/q$b;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string p1, "application/cea-708"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance p1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    iget-wide v0, v4, Lo0/a;->a:J

    .line 117
    .line 118
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v0, ":cea708"

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p0, p1}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ld0/q$b;->K()Ld0/q;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    sget-object p1, Landroidx/media3/exoplayer/dash/b;->N:Ljava/util/regex/Pattern;

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_3
    new-array p0, v1, [Ld0/q;

    .line 149
    .line 150
    return-object p0
.end method

.method public static B(Ljava/util/List;)[[I
    .locals 12

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, LX2/G;->f(I)Ljava/util/HashMap;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3, v0}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v0, :cond_0

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo0/a;

    iget-wide v6, v6, Lo0/a;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_1
    if-ge v5, v0, :cond_6

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo0/a;

    iget-object v7, v6, Lo0/a;->e:Ljava/util/List;

    invoke-static {v7}, Landroidx/media3/exoplayer/dash/b;->z(Ljava/util/List;)Lo0/e;

    move-result-object v7

    if-nez v7, :cond_1

    iget-object v7, v6, Lo0/a;->f:Ljava/util/List;

    invoke-static {v7}, Landroidx/media3/exoplayer/dash/b;->z(Ljava/util/List;)Lo0/e;

    move-result-object v7

    :cond_1
    if-eqz v7, :cond_2

    iget-object v7, v7, Lo0/e;->b:Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_2

    :cond_2
    move v7, v5

    :goto_2
    if-ne v7, v5, :cond_4

    iget-object v6, v6, Lo0/a;->f:Ljava/util/List;

    invoke-static {v6}, Landroidx/media3/exoplayer/dash/b;->x(Ljava/util/List;)Lo0/e;

    move-result-object v6

    if-eqz v6, :cond_4

    iget-object v6, v6, Lo0/e;->b:Ljava/lang/String;

    const-string v8, ","

    invoke-static {v6, v8}, Lg0/M;->b1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v8, v6

    move v9, v4

    :goto_3
    if-ge v9, v8, :cond_4

    aget-object v10, v6, v9

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    if-eqz v10, :cond_3

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static {v7, v10}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_4
    if-eq v7, v5, :cond_5

    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {v3, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v3, v5, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-interface {v2, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p0

    new-array v0, p0, [[I

    :goto_4
    if-ge v4, p0, :cond_7

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, La3/f;->n(Ljava/util/Collection;)[I

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {v1}, Ljava/util/Arrays;->sort([I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_7
    return-object v0
.end method

.method public static E(Ljava/util/List;[I)Z
    .locals 6

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget v3, p1, v2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo0/a;

    iget-object v3, v3, Lo0/a;->c:Ljava/util/List;

    move v4, v1

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0/j;

    iget-object v5, v5, Lo0/j;->e:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static F(ILjava/util/List;[[I[Z[[Ld0/q;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-ge v0, p0, :cond_2

    .line 4
    .line 5
    aget-object v2, p2, v0

    .line 6
    .line 7
    invoke-static {p1, v2}, Landroidx/media3/exoplayer/dash/b;->E(Ljava/util/List;[I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    aput-boolean v2, p3, v0

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    :cond_0
    aget-object v2, p2, v0

    .line 19
    .line 20
    invoke-static {p1, v2}, Landroidx/media3/exoplayer/dash/b;->A(Ljava/util/List;[I)[Ld0/q;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    aput-object v2, p4, v0

    .line 25
    .line 26
    array-length v2, v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return v1
.end method

.method public static synthetic G(Ly0/h;)Ljava/util/List;
    .locals 0

    .line 1
    iget p0, p0, Ly0/h;->o:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, LX2/v;->Z(Ljava/lang/Object;)LX2/v;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static H(Landroidx/media3/exoplayer/dash/a$a;[Ld0/q;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    aget-object v1, p1, v0

    .line 6
    .line 7
    invoke-interface {p0, v1}, Landroidx/media3/exoplayer/dash/a$a;->b(Ld0/q;)Ld0/q;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    aput-object v1, p1, v0

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void
.end method

.method public static I(I)[Ly0/h;
    .locals 0

    .line 1
    new-array p0, p0, [Ly0/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static K(Lo0/e;Ljava/util/regex/Pattern;Ld0/q;)[Ld0/q;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object p0, p0, Lo0/e;->b:Ljava/lang/String;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    new-array p0, v1, [Ld0/q;

    .line 8
    .line 9
    aput-object p2, p0, v0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v2, ";"

    .line 13
    .line 14
    invoke-static {p0, v2}, Lg0/M;->b1(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    array-length v2, p0

    .line 19
    new-array v2, v2, [Ld0/q;

    .line 20
    .line 21
    move v3, v0

    .line 22
    :goto_0
    array-length v4, p0

    .line 23
    if-ge v3, v4, :cond_2

    .line 24
    .line 25
    aget-object v4, p0, v3

    .line 26
    .line 27
    invoke-virtual {p1, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-nez v5, :cond_1

    .line 36
    .line 37
    new-array p0, v1, [Ld0/q;

    .line 38
    .line 39
    aput-object p2, p0, v0

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {p2}, Ld0/q;->a()Ld0/q$b;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    new-instance v7, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    iget-object v8, p2, Ld0/q;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v8, ":"

    .line 65
    .line 66
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v6, v7}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v6, v5}, Ld0/q$b;->L(I)Ld0/q$b;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    const/4 v6, 0x2

    .line 85
    invoke-virtual {v4, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v5, v4}, Ld0/q$b;->e0(Ljava/lang/String;)Ld0/q$b;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v4}, Ld0/q$b;->K()Ld0/q;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    aput-object v4, v2, v3

    .line 98
    .line 99
    add-int/2addr v3, v1

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    return-object v2
.end method

.method public static synthetic j(Ly0/h;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/media3/exoplayer/dash/b;->G(Ly0/h;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static r(Ljava/util/List;[Ld0/J;[Landroidx/media3/exoplayer/dash/b$a;I)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-ge v2, v3, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lo0/f;

    .line 15
    .line 16
    new-instance v4, Ld0/q$b;

    .line 17
    .line 18
    invoke-direct {v4}, Ld0/q$b;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Lo0/f;->a()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v4, v5}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "application/x-emsg"

    .line 30
    .line 31
    invoke-virtual {v4, v5}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Ld0/q$b;->K()Ld0/q;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    new-instance v5, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lo0/f;->a()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v3, ":"

    .line 52
    .line 53
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    new-instance v5, Ld0/J;

    .line 64
    .line 65
    new-array v6, v0, [Ld0/q;

    .line 66
    .line 67
    aput-object v4, v6, v1

    .line 68
    .line 69
    invoke-direct {v5, v3, v6}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    .line 70
    .line 71
    .line 72
    aput-object v5, p1, p3

    .line 73
    .line 74
    add-int/lit8 v3, p3, 0x1

    .line 75
    .line 76
    invoke-static {v2}, Landroidx/media3/exoplayer/dash/b$a;->c(I)Landroidx/media3/exoplayer/dash/b$a;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    aput-object v4, p2, p3

    .line 81
    .line 82
    add-int/2addr v2, v0

    .line 83
    move p3, v3

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    return-void
.end method

.method public static t(Lp0/x;Landroidx/media3/exoplayer/dash/a$a;Ljava/util/List;[[II[Z[[Ld0/q;[Ld0/J;[Landroidx/media3/exoplayer/dash/b$a;)I
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    move/from16 v4, p4

    .line 8
    .line 9
    move v5, v3

    .line 10
    move v6, v5

    .line 11
    :goto_0
    if-ge v5, v4, :cond_7

    .line 12
    .line 13
    aget-object v7, p3, v5

    .line 14
    .line 15
    new-instance v8, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    array-length v9, v7

    .line 21
    move v10, v3

    .line 22
    :goto_1
    if-ge v10, v9, :cond_0

    .line 23
    .line 24
    aget v11, v7, v10

    .line 25
    .line 26
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v11

    .line 30
    check-cast v11, Lo0/a;

    .line 31
    .line 32
    iget-object v11, v11, Lo0/a;->c:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v8, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    add-int/2addr v10, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    new-array v10, v9, [Ld0/q;

    .line 44
    .line 45
    move v11, v3

    .line 46
    :goto_2
    if-ge v11, v9, :cond_1

    .line 47
    .line 48
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v12

    .line 52
    check-cast v12, Lo0/j;

    .line 53
    .line 54
    iget-object v12, v12, Lo0/j;->b:Ld0/q;

    .line 55
    .line 56
    invoke-virtual {v12}, Ld0/q;->a()Ld0/q$b;

    .line 57
    .line 58
    .line 59
    move-result-object v13

    .line 60
    move-object/from16 v14, p0

    .line 61
    .line 62
    invoke-interface {v14, v12}, Lp0/x;->b(Ld0/q;)I

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    invoke-virtual {v13, v12}, Ld0/q$b;->R(I)Ld0/q$b;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    invoke-virtual {v12}, Ld0/q$b;->K()Ld0/q;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    aput-object v12, v10, v11

    .line 75
    .line 76
    add-int/2addr v11, v2

    .line 77
    goto :goto_2

    .line 78
    :cond_1
    move-object/from16 v14, p0

    .line 79
    .line 80
    aget v8, v7, v3

    .line 81
    .line 82
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    check-cast v8, Lo0/a;

    .line 87
    .line 88
    iget-wide v11, v8, Lo0/a;->a:J

    .line 89
    .line 90
    const-wide/16 v15, -0x1

    .line 91
    .line 92
    cmp-long v9, v11, v15

    .line 93
    .line 94
    if-eqz v9, :cond_2

    .line 95
    .line 96
    invoke-static {v11, v12}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    goto :goto_3

    .line 101
    :cond_2
    new-instance v9, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    const-string v11, "unset:"

    .line 107
    .line 108
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    :goto_3
    add-int/lit8 v11, v6, 0x1

    .line 119
    .line 120
    aget-boolean v12, p5, v5

    .line 121
    .line 122
    const/4 v13, -0x1

    .line 123
    if-eqz v12, :cond_3

    .line 124
    .line 125
    add-int/lit8 v12, v6, 0x2

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_3
    move v12, v11

    .line 129
    move v11, v13

    .line 130
    :goto_4
    aget-object v15, p6, v5

    .line 131
    .line 132
    array-length v15, v15

    .line 133
    if-eqz v15, :cond_4

    .line 134
    .line 135
    add-int/lit8 v15, v12, 0x1

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_4
    move v15, v12

    .line 139
    move v12, v13

    .line 140
    :goto_5
    invoke-static {v0, v10}, Landroidx/media3/exoplayer/dash/b;->H(Landroidx/media3/exoplayer/dash/a$a;[Ld0/q;)V

    .line 141
    .line 142
    .line 143
    new-instance v3, Ld0/J;

    .line 144
    .line 145
    invoke-direct {v3, v9, v10}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    .line 146
    .line 147
    .line 148
    aput-object v3, p7, v6

    .line 149
    .line 150
    iget v3, v8, Lo0/a;->b:I

    .line 151
    .line 152
    invoke-static {v3, v7, v6, v11, v12}, Landroidx/media3/exoplayer/dash/b$a;->d(I[IIII)Landroidx/media3/exoplayer/dash/b$a;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    aput-object v3, p8, v6

    .line 157
    .line 158
    if-eq v11, v13, :cond_5

    .line 159
    .line 160
    new-instance v3, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v8, ":emsg"

    .line 169
    .line 170
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    new-instance v8, Ld0/q$b;

    .line 178
    .line 179
    invoke-direct {v8}, Ld0/q$b;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v8, v3}, Ld0/q$b;->a0(Ljava/lang/String;)Ld0/q$b;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    const-string v10, "application/x-emsg"

    .line 187
    .line 188
    invoke-virtual {v8, v10}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-virtual {v8}, Ld0/q$b;->K()Ld0/q;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    new-instance v10, Ld0/J;

    .line 197
    .line 198
    new-array v13, v2, [Ld0/q;

    .line 199
    .line 200
    const/16 v16, 0x0

    .line 201
    .line 202
    aput-object v8, v13, v16

    .line 203
    .line 204
    invoke-direct {v10, v3, v13}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    .line 205
    .line 206
    .line 207
    aput-object v10, p7, v11

    .line 208
    .line 209
    invoke-static {v7, v6}, Landroidx/media3/exoplayer/dash/b$a;->b([II)Landroidx/media3/exoplayer/dash/b$a;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    aput-object v3, p8, v11

    .line 214
    .line 215
    const/4 v3, -0x1

    .line 216
    goto :goto_6

    .line 217
    :cond_5
    const/16 v16, 0x0

    .line 218
    .line 219
    move v3, v13

    .line 220
    :goto_6
    if-eq v12, v3, :cond_6

    .line 221
    .line 222
    new-instance v3, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const-string v8, ":cc"

    .line 231
    .line 232
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    aget-object v8, p6, v5

    .line 240
    .line 241
    invoke-static {v8}, LX2/v;->V([Ljava/lang/Object;)LX2/v;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-static {v7, v6, v8}, Landroidx/media3/exoplayer/dash/b$a;->a([IILX2/v;)Landroidx/media3/exoplayer/dash/b$a;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    aput-object v6, p8, v12

    .line 250
    .line 251
    aget-object v6, p6, v5

    .line 252
    .line 253
    invoke-static {v0, v6}, Landroidx/media3/exoplayer/dash/b;->H(Landroidx/media3/exoplayer/dash/a$a;[Ld0/q;)V

    .line 254
    .line 255
    .line 256
    new-instance v6, Ld0/J;

    .line 257
    .line 258
    aget-object v7, p6, v5

    .line 259
    .line 260
    invoke-direct {v6, v3, v7}, Ld0/J;-><init>(Ljava/lang/String;[Ld0/q;)V

    .line 261
    .line 262
    .line 263
    aput-object v6, p7, v12

    .line 264
    .line 265
    :cond_6
    add-int/2addr v5, v2

    .line 266
    move v6, v15

    .line 267
    move/from16 v3, v16

    .line 268
    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :cond_7
    return v6
.end method

.method public static w(Lp0/x;Landroidx/media3/exoplayer/dash/a$a;Ljava/util/List;Ljava/util/List;)Landroid/util/Pair;
    .locals 11

    .line 1
    invoke-static {p2}, Landroidx/media3/exoplayer/dash/b;->B(Ljava/util/List;)[[I

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    array-length v4, v3

    .line 6
    new-array v5, v4, [Z

    .line 7
    .line 8
    new-array v6, v4, [[Ld0/q;

    .line 9
    .line 10
    invoke-static {v4, p2, v3, v5, v6}, Landroidx/media3/exoplayer/dash/b;->F(ILjava/util/List;[[I[Z[[Ld0/q;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, v4

    .line 15
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    new-array v9, v0, [Ld0/J;

    .line 21
    .line 22
    new-array v10, v0, [Landroidx/media3/exoplayer/dash/b$a;

    .line 23
    .line 24
    move-object v0, p0

    .line 25
    move-object v1, p1

    .line 26
    move-object v2, p2

    .line 27
    move-object v7, v9

    .line 28
    move-object v8, v10

    .line 29
    invoke-static/range {v0 .. v8}, Landroidx/media3/exoplayer/dash/b;->t(Lp0/x;Landroidx/media3/exoplayer/dash/a$a;Ljava/util/List;[[II[Z[[Ld0/q;[Ld0/J;[Landroidx/media3/exoplayer/dash/b$a;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p3, v9, v10, p0}, Landroidx/media3/exoplayer/dash/b;->r(Ljava/util/List;[Ld0/J;[Landroidx/media3/exoplayer/dash/b$a;I)V

    .line 34
    .line 35
    .line 36
    new-instance p0, Lx0/Z;

    .line 37
    .line 38
    invoke-direct {p0, v9}, Lx0/Z;-><init>([Ld0/J;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v10}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static x(Ljava/util/List;)Lo0/e;
    .locals 1

    .line 1
    const-string v0, "urn:mpeg:dash:adaptation-set-switching:2016"

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/media3/exoplayer/dash/b;->y(Ljava/util/List;Ljava/lang/String;)Lo0/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static y(Ljava/util/List;Ljava/lang/String;)Lo0/e;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lo0/e;

    .line 13
    .line 14
    iget-object v2, v1, Lo0/e;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static z(Ljava/util/List;)Lo0/e;
    .locals 1

    .line 1
    const-string v0, "http://dashif.org/guidelines/trickmode"

    .line 2
    .line 3
    invoke-static {p0, v0}, Landroidx/media3/exoplayer/dash/b;->y(Ljava/util/List;Ljava/lang/String;)Lo0/e;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final C(I[I)I
    .locals 4

    .line 1
    aget p1, p2, p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/b;->y:[Landroidx/media3/exoplayer/dash/b$a;

    aget-object p1, v1, p1

    iget p1, p1, Landroidx/media3/exoplayer/dash/b$a;->e:I

    const/4 v1, 0x0

    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_2

    aget v2, p2, v1

    if-ne v2, p1, :cond_1

    iget-object v3, p0, Landroidx/media3/exoplayer/dash/b;->y:[Landroidx/media3/exoplayer/dash/b$a;

    aget-object v2, v3, v2

    iget v2, v2, Landroidx/media3/exoplayer/dash/b$a;->c:I

    if-nez v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final D([LA0/y;)[I
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p1

    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    iget-object v3, p0, Landroidx/media3/exoplayer/dash/b;->x:Lx0/Z;

    .line 13
    .line 14
    invoke-interface {v2}, LA0/B;->d()Ld0/J;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v3, v2}, Lx0/Z;->d(Ld0/J;)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    aput v2, v0, v1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v2, -0x1

    .line 26
    aput v2, v0, v1

    .line 27
    .line 28
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-object v0
.end method

.method public J(Ly0/h;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/b;->F:Lx0/v$a;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lx0/S$a;->e(Lx0/S;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public L()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->A:Landroidx/media3/exoplayer/dash/d;

    invoke-virtual {v0}, Landroidx/media3/exoplayer/dash/d;->o()V

    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->G:[Ly0/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p0}, Ly0/h;->P(Ly0/h$b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/media3/exoplayer/dash/b;->F:Lx0/v$a;

    return-void
.end method

.method public final M([LA0/y;[Z[Lx0/Q;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_4

    .line 4
    .line 5
    aget-object v1, p1, v0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    aget-boolean v1, p2, v0

    .line 10
    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    :cond_0
    aget-object v1, p3, v0

    .line 14
    .line 15
    instance-of v2, v1, Ly0/h;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    check-cast v1, Ly0/h;

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ly0/h;->P(Ly0/h$b;)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    instance-of v2, v1, Ly0/h$a;

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    check-cast v1, Ly0/h$a;

    .line 30
    .line 31
    invoke-virtual {v1}, Ly0/h$a;->c()V

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_1
    const/4 v1, 0x0

    .line 35
    aput-object v1, p3, v0

    .line 36
    .line 37
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    return-void
.end method

.method public final N([LA0/y;[Lx0/Q;[I)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_5

    .line 4
    .line 5
    aget-object v1, p2, v0

    .line 6
    .line 7
    instance-of v2, v1, Lx0/o;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    instance-of v1, v1, Ly0/h$a;

    .line 12
    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0, v0, p3}, Landroidx/media3/exoplayer/dash/b;->C(I[I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, -0x1

    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    aget-object v1, p2, v0

    .line 23
    .line 24
    instance-of v1, v1, Lx0/o;

    .line 25
    .line 26
    if-nez v1, :cond_4

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    aget-object v2, p2, v0

    .line 30
    .line 31
    instance-of v3, v2, Ly0/h$a;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    check-cast v2, Ly0/h$a;

    .line 36
    .line 37
    iget-object v2, v2, Ly0/h$a;->o:Ly0/h;

    .line 38
    .line 39
    aget-object v1, p2, v1

    .line 40
    .line 41
    if-ne v2, v1, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    :goto_1
    aget-object v1, p2, v0

    .line 45
    .line 46
    instance-of v2, v1, Ly0/h$a;

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    check-cast v1, Ly0/h$a;

    .line 51
    .line 52
    invoke-virtual {v1}, Ly0/h$a;->c()V

    .line 53
    .line 54
    .line 55
    :cond_3
    const/4 v1, 0x0

    .line 56
    aput-object v1, p2, v0

    .line 57
    .line 58
    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_5
    return-void
.end method

.method public final O([LA0/y;[Lx0/Q;[ZJ[I)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    const/4 v3, 0x1

    .line 5
    if-ge v1, v2, :cond_4

    .line 6
    .line 7
    aget-object v2, p1, v1

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    aget-object v4, p2, v1

    .line 13
    .line 14
    if-nez v4, :cond_2

    .line 15
    .line 16
    aput-boolean v3, p3, v1

    .line 17
    .line 18
    aget v3, p6, v1

    .line 19
    .line 20
    iget-object v4, p0, Landroidx/media3/exoplayer/dash/b;->y:[Landroidx/media3/exoplayer/dash/b$a;

    .line 21
    .line 22
    aget-object v3, v4, v3

    .line 23
    .line 24
    iget v4, v3, Landroidx/media3/exoplayer/dash/b$a;->c:I

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v3, v2, p4, p5}, Landroidx/media3/exoplayer/dash/b;->v(Landroidx/media3/exoplayer/dash/b$a;LA0/y;J)Ly0/h;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    aput-object v2, p2, v1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v5, 0x2

    .line 36
    if-ne v4, v5, :cond_3

    .line 37
    .line 38
    iget-object v4, p0, Landroidx/media3/exoplayer/dash/b;->L:Ljava/util/List;

    .line 39
    .line 40
    iget v3, v3, Landroidx/media3/exoplayer/dash/b$a;->d:I

    .line 41
    .line 42
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lo0/f;

    .line 47
    .line 48
    invoke-interface {v2}, LA0/B;->d()Ld0/J;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2, v0}, Ld0/J;->a(I)Ld0/q;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v4, Ln0/j;

    .line 57
    .line 58
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/b;->J:Lo0/c;

    .line 59
    .line 60
    iget-boolean v5, v5, Lo0/c;->d:Z

    .line 61
    .line 62
    invoke-direct {v4, v3, v2, v5}, Ln0/j;-><init>(Lo0/f;Ld0/q;Z)V

    .line 63
    .line 64
    .line 65
    aput-object v4, p2, v1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    instance-of v3, v4, Ly0/h;

    .line 69
    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    check-cast v4, Ly0/h;

    .line 73
    .line 74
    invoke-virtual {v4}, Ly0/h;->E()Ly0/i;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Landroidx/media3/exoplayer/dash/a;

    .line 79
    .line 80
    invoke-interface {v3, v2}, Landroidx/media3/exoplayer/dash/a;->i(LA0/y;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    :goto_2
    array-length p3, p1

    .line 87
    if-ge v0, p3, :cond_7

    .line 88
    .line 89
    aget-object p3, p2, v0

    .line 90
    .line 91
    if-nez p3, :cond_6

    .line 92
    .line 93
    aget-object p3, p1, v0

    .line 94
    .line 95
    if-eqz p3, :cond_6

    .line 96
    .line 97
    aget p3, p6, v0

    .line 98
    .line 99
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/b;->y:[Landroidx/media3/exoplayer/dash/b$a;

    .line 100
    .line 101
    aget-object p3, v1, p3

    .line 102
    .line 103
    iget v1, p3, Landroidx/media3/exoplayer/dash/b$a;->c:I

    .line 104
    .line 105
    if-ne v1, v3, :cond_6

    .line 106
    .line 107
    invoke-virtual {p0, v0, p6}, Landroidx/media3/exoplayer/dash/b;->C(I[I)I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    const/4 v2, -0x1

    .line 112
    if-ne v1, v2, :cond_5

    .line 113
    .line 114
    new-instance p3, Lx0/o;

    .line 115
    .line 116
    invoke-direct {p3}, Lx0/o;-><init>()V

    .line 117
    .line 118
    .line 119
    aput-object p3, p2, v0

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    aget-object v1, p2, v1

    .line 123
    .line 124
    check-cast v1, Ly0/h;

    .line 125
    .line 126
    iget p3, p3, Landroidx/media3/exoplayer/dash/b$a;->b:I

    .line 127
    .line 128
    invoke-virtual {v1, p4, p5, p3}, Ly0/h;->S(JI)Ly0/h$a;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    aput-object p3, p2, v0

    .line 133
    .line 134
    :cond_6
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    return-void
.end method

.method public P(Lo0/c;I)V
    .locals 9

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/b;->J:Lo0/c;

    .line 2
    .line 3
    iput p2, p0, Landroidx/media3/exoplayer/dash/b;->K:I

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->A:Landroidx/media3/exoplayer/dash/d;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/media3/exoplayer/dash/d;->q(Lo0/c;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->G:[Ly0/h;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    array-length v2, v0

    .line 16
    move v3, v1

    .line 17
    :goto_0
    if-ge v3, v2, :cond_0

    .line 18
    .line 19
    aget-object v4, v0, v3

    .line 20
    .line 21
    invoke-virtual {v4}, Ly0/h;->E()Ly0/i;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Landroidx/media3/exoplayer/dash/a;

    .line 26
    .line 27
    invoke-interface {v4, p1, p2}, Landroidx/media3/exoplayer/dash/a;->c(Lo0/c;I)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->F:Lx0/v$a;

    .line 34
    .line 35
    invoke-interface {v0, p0}, Lx0/S$a;->e(Lx0/S;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p1, p2}, Lo0/c;->d(I)Lo0/g;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, Lo0/g;->d:Ljava/util/List;

    .line 43
    .line 44
    iput-object v0, p0, Landroidx/media3/exoplayer/dash/b;->L:Ljava/util/List;

    .line 45
    .line 46
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->H:[Ln0/j;

    .line 47
    .line 48
    array-length v2, v0

    .line 49
    move v3, v1

    .line 50
    :goto_1
    if-ge v3, v2, :cond_5

    .line 51
    .line 52
    aget-object v4, v0, v3

    .line 53
    .line 54
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/b;->L:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Lo0/f;

    .line 71
    .line 72
    invoke-virtual {v6}, Lo0/f;->a()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v4}, Ln0/j;->b()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_2

    .line 85
    .line 86
    invoke-virtual {p1}, Lo0/c;->e()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    const/4 v7, 0x1

    .line 91
    sub-int/2addr v5, v7

    .line 92
    iget-boolean v8, p1, Lo0/c;->d:Z

    .line 93
    .line 94
    if-eqz v8, :cond_3

    .line 95
    .line 96
    if-ne p2, v5, :cond_3

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move v7, v1

    .line 100
    :goto_2
    invoke-virtual {v4, v6, v7}, Ln0/j;->d(Lo0/f;Z)V

    .line 101
    .line 102
    .line 103
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    return-void
.end method

.method public declared-synchronized a(Ly0/h;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->B:Ljava/util/IdentityHashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroidx/media3/exoplayer/dash/d$c;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/media3/exoplayer/dash/d$c;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit p0

    .line 21
    throw p1
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->I:Lx0/S;

    invoke-interface {v0}, Lx0/S;->b()Z

    move-result v0

    return v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->I:Lx0/S;

    invoke-interface {v0}, Lx0/S;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(JLk0/d1;)J
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->G:[Ly0/h;

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
    iget v4, v3, Ly0/h;->o:I

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    if-ne v4, v5, :cond_0

    .line 13
    .line 14
    invoke-virtual {v3, p1, p2, p3}, Ly0/h;->d(JLk0/d1;)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    return-wide p1

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-wide p1
.end method

.method public bridge synthetic e(Lx0/S;)V
    .locals 0

    .line 1
    check-cast p1, Ly0/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/b;->J(Ly0/h;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->I:Lx0/S;

    invoke-interface {v0}, Lx0/S;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(Lk0/y0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->I:Lx0/S;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lx0/S;->g(Lk0/y0;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public h(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->I:Lx0/S;

    invoke-interface {v0, p1, p2}, Lx0/S;->h(J)V

    return-void
.end method

.method public i([LA0/y;[Z[Lx0/Q;[ZJ)J
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/b;->D([LA0/y;)[I

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Landroidx/media3/exoplayer/dash/b;->M([LA0/y;[Z[Lx0/Q;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, p3, v6}, Landroidx/media3/exoplayer/dash/b;->N([LA0/y;[Lx0/Q;[I)V

    .line 9
    .line 10
    .line 11
    move-object v0, p0

    .line 12
    move-object v1, p1

    .line 13
    move-object v2, p3

    .line 14
    move-object v3, p4

    .line 15
    move-wide v4, p5

    .line 16
    invoke-virtual/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/b;->O([LA0/y;[Lx0/Q;[ZJ[I)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance p2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    array-length p4, p3

    .line 30
    const/4 v0, 0x0

    .line 31
    :goto_0
    if-ge v0, p4, :cond_2

    .line 32
    .line 33
    aget-object v1, p3, v0

    .line 34
    .line 35
    instance-of v2, v1, Ly0/h;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    check-cast v1, Ly0/h;

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    instance-of v2, v1, Ln0/j;

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    check-cast v1, Ln0/j;

    .line 50
    .line 51
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    invoke-static {p3}, Landroidx/media3/exoplayer/dash/b;->I(I)[Ly0/h;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    iput-object p3, p0, Landroidx/media3/exoplayer/dash/b;->G:[Ly0/h;

    .line 66
    .line 67
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    new-array p3, p3, [Ln0/j;

    .line 75
    .line 76
    iput-object p3, p0, Landroidx/media3/exoplayer/dash/b;->H:[Ln0/j;

    .line 77
    .line 78
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    iget-object p2, p0, Landroidx/media3/exoplayer/dash/b;->z:Lx0/j;

    .line 82
    .line 83
    new-instance p3, Ln0/d;

    .line 84
    .line 85
    invoke-direct {p3}, Ln0/d;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-static {p1, p3}, LX2/E;->k(Ljava/util/List;LW2/g;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    invoke-interface {p2, p1, p3}, Lx0/j;->b(Ljava/util/List;Ljava/util/List;)Lx0/S;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/b;->I:Lx0/S;

    .line 97
    .line 98
    return-wide p5
.end method

.method public l()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public n()Lx0/Z;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->x:Lx0/Z;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->v:LB0/o;

    invoke-interface {v0}, LB0/o;->a()V

    return-void
.end method

.method public q(JZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->G:[Ly0/h;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2, p3}, Ly0/h;->q(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public s(J)J
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->G:[Ly0/h;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4, p1, p2}, Ly0/h;->R(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/b;->H:[Ln0/j;

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Ln0/j;->c(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-wide p1
.end method

.method public u(Lx0/v$a;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/b;->F:Lx0/v$a;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lx0/v$a;->k(Lx0/v;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v(Landroidx/media3/exoplayer/dash/b$a;LA0/y;J)Ly0/h;
    .locals 33

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v1, v0, Landroidx/media3/exoplayer/dash/b$a;->f:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, -0x1

    .line 10
    if-eq v1, v4, :cond_0

    .line 11
    .line 12
    move/from16 v25, v2

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move/from16 v25, v3

    .line 16
    .line 17
    :goto_0
    const/4 v5, 0x0

    .line 18
    if-eqz v25, :cond_1

    .line 19
    .line 20
    iget-object v6, v14, Landroidx/media3/exoplayer/dash/b;->x:Lx0/Z;

    .line 21
    .line 22
    invoke-virtual {v6, v1}, Lx0/Z;->b(I)Ld0/J;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move v6, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v6, v3

    .line 29
    move-object v1, v5

    .line 30
    :goto_1
    iget v7, v0, Landroidx/media3/exoplayer/dash/b$a;->g:I

    .line 31
    .line 32
    if-eq v7, v4, :cond_2

    .line 33
    .line 34
    iget-object v4, v14, Landroidx/media3/exoplayer/dash/b;->y:[Landroidx/media3/exoplayer/dash/b$a;

    .line 35
    .line 36
    aget-object v4, v4, v7

    .line 37
    .line 38
    iget-object v4, v4, Landroidx/media3/exoplayer/dash/b$a;->h:LX2/v;

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :goto_2
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    add-int/2addr v6, v7

    .line 50
    new-array v7, v6, [Ld0/q;

    .line 51
    .line 52
    new-array v6, v6, [I

    .line 53
    .line 54
    if-eqz v25, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ld0/J;->a(I)Ld0/q;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    aput-object v1, v7, v3

    .line 61
    .line 62
    const/4 v1, 0x5

    .line 63
    aput v1, v6, v3

    .line 64
    .line 65
    move v1, v2

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    move v1, v3

    .line 68
    :goto_3
    new-instance v8, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    :goto_4
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-ge v3, v9, :cond_4

    .line 78
    .line 79
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    check-cast v9, Ld0/q;

    .line 84
    .line 85
    aput-object v9, v7, v1

    .line 86
    .line 87
    const/4 v10, 0x3

    .line 88
    aput v10, v6, v1

    .line 89
    .line 90
    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    add-int/2addr v1, v2

    .line 94
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_4
    iget-object v1, v14, Landroidx/media3/exoplayer/dash/b;->J:Lo0/c;

    .line 98
    .line 99
    iget-boolean v1, v1, Lo0/c;->d:Z

    .line 100
    .line 101
    if-eqz v1, :cond_5

    .line 102
    .line 103
    if-eqz v25, :cond_5

    .line 104
    .line 105
    iget-object v1, v14, Landroidx/media3/exoplayer/dash/b;->A:Landroidx/media3/exoplayer/dash/d;

    .line 106
    .line 107
    invoke-virtual {v1}, Landroidx/media3/exoplayer/dash/d;->k()Landroidx/media3/exoplayer/dash/d$c;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    :cond_5
    move-object v13, v5

    .line 112
    iget-object v15, v14, Landroidx/media3/exoplayer/dash/b;->p:Landroidx/media3/exoplayer/dash/a$a;

    .line 113
    .line 114
    iget-object v1, v14, Landroidx/media3/exoplayer/dash/b;->v:LB0/o;

    .line 115
    .line 116
    iget-object v2, v14, Landroidx/media3/exoplayer/dash/b;->J:Lo0/c;

    .line 117
    .line 118
    iget-object v3, v14, Landroidx/media3/exoplayer/dash/b;->t:Ln0/b;

    .line 119
    .line 120
    iget v4, v14, Landroidx/media3/exoplayer/dash/b;->K:I

    .line 121
    .line 122
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/b$a;->a:[I

    .line 123
    .line 124
    iget v9, v0, Landroidx/media3/exoplayer/dash/b$a;->b:I

    .line 125
    .line 126
    iget-wide v10, v14, Landroidx/media3/exoplayer/dash/b;->u:J

    .line 127
    .line 128
    iget-object v12, v14, Landroidx/media3/exoplayer/dash/b;->q:Li0/y;

    .line 129
    .line 130
    move-object/from16 v31, v7

    .line 131
    .line 132
    iget-object v7, v14, Landroidx/media3/exoplayer/dash/b;->E:Ll0/y1;

    .line 133
    .line 134
    const/16 v30, 0x0

    .line 135
    .line 136
    move-object/from16 v16, v1

    .line 137
    .line 138
    move-object/from16 v17, v2

    .line 139
    .line 140
    move-object/from16 v18, v3

    .line 141
    .line 142
    move/from16 v19, v4

    .line 143
    .line 144
    move-object/from16 v20, v5

    .line 145
    .line 146
    move-object/from16 v21, p2

    .line 147
    .line 148
    move/from16 v22, v9

    .line 149
    .line 150
    move-wide/from16 v23, v10

    .line 151
    .line 152
    move-object/from16 v26, v8

    .line 153
    .line 154
    move-object/from16 v27, v13

    .line 155
    .line 156
    move-object/from16 v28, v12

    .line 157
    .line 158
    move-object/from16 v29, v7

    .line 159
    .line 160
    invoke-interface/range {v15 .. v30}, Landroidx/media3/exoplayer/dash/a$a;->c(LB0/o;Lo0/c;Ln0/b;I[ILA0/y;IJZLjava/util/List;Landroidx/media3/exoplayer/dash/d$c;Li0/y;Ll0/y1;LB0/f;)Landroidx/media3/exoplayer/dash/a;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    new-instance v15, Ly0/h;

    .line 165
    .line 166
    iget v2, v0, Landroidx/media3/exoplayer/dash/b$a;->b:I

    .line 167
    .line 168
    iget-object v7, v14, Landroidx/media3/exoplayer/dash/b;->w:LB0/b;

    .line 169
    .line 170
    iget-object v10, v14, Landroidx/media3/exoplayer/dash/b;->r:Lp0/x;

    .line 171
    .line 172
    iget-object v11, v14, Landroidx/media3/exoplayer/dash/b;->D:Lp0/v$a;

    .line 173
    .line 174
    iget-object v12, v14, Landroidx/media3/exoplayer/dash/b;->s:LB0/m;

    .line 175
    .line 176
    iget-object v0, v14, Landroidx/media3/exoplayer/dash/b;->C:Lx0/E$a;

    .line 177
    .line 178
    move-object v1, v15

    .line 179
    move-object v3, v6

    .line 180
    move-object/from16 v4, v31

    .line 181
    .line 182
    move-object/from16 v6, p0

    .line 183
    .line 184
    move-wide/from16 v8, p3

    .line 185
    .line 186
    move-object/from16 v32, v13

    .line 187
    .line 188
    move-object v13, v0

    .line 189
    invoke-direct/range {v1 .. v13}, Ly0/h;-><init>(I[I[Ld0/q;Ly0/i;Lx0/S$a;LB0/b;JLp0/x;Lp0/v$a;LB0/m;Lx0/E$a;)V

    .line 190
    .line 191
    .line 192
    monitor-enter p0

    .line 193
    :try_start_0
    iget-object v0, v14, Landroidx/media3/exoplayer/dash/b;->B:Ljava/util/IdentityHashMap;

    .line 194
    .line 195
    move-object/from16 v5, v32

    .line 196
    .line 197
    invoke-virtual {v0, v15, v5}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    monitor-exit p0

    .line 201
    return-object v15

    .line 202
    :catchall_0
    move-exception v0

    .line 203
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 204
    throw v0
.end method
