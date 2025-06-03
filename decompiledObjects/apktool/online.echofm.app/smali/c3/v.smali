.class public final Lc3/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc3/v$b;,
        Lc3/v$d;,
        Lc3/v$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentMap;

.field public b:Lc3/v$c;

.field public final c:Ljava/lang/Class;

.field public final d:Ln3/a;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ConcurrentMap;Lc3/v$c;Ln3/a;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/v;->a:Ljava/util/concurrent/ConcurrentMap;

    iput-object p2, p0, Lc3/v;->b:Lc3/v$c;

    iput-object p4, p0, Lc3/v;->c:Ljava/lang/Class;

    iput-object p3, p0, Lc3/v;->d:Ln3/a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lc3/v;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/ConcurrentMap;Lc3/v$c;Ln3/a;Ljava/lang/Class;Lc3/v$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lc3/v;-><init>(Ljava/util/concurrent/ConcurrentMap;Lc3/v$c;Ln3/a;Ljava/lang/Class;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/Object;Lp3/C$c;Ljava/util/concurrent/ConcurrentMap;)Lc3/v$c;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lc3/v;->b(Ljava/lang/Object;Ljava/lang/Object;Lp3/C$c;Ljava/util/concurrent/ConcurrentMap;)Lc3/v$c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/Object;Lp3/C$c;Ljava/util/concurrent/ConcurrentMap;)Lc3/v$c;
    .locals 14

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Lp3/C$c;->a0()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual/range {p2 .. p2}, Lp3/C$c;->b0()Lp3/I;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v3, Lp3/I;->s:Lp3/I;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    if-ne v2, v3, :cond_0

    .line 19
    .line 20
    move-object v1, v4

    .line 21
    :cond_0
    invoke-static {}, Lk3/i;->a()Lk3/i;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual/range {p2 .. p2}, Lp3/C$c;->Z()Lp3/y;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Lp3/y;->a0()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual/range {p2 .. p2}, Lp3/C$c;->Z()Lp3/y;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5}, Lp3/y;->b0()Lcom/google/crypto/tink/shaded/protobuf/h;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual/range {p2 .. p2}, Lp3/C$c;->Z()Lp3/y;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Lp3/y;->Z()Lp3/y$c;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual/range {p2 .. p2}, Lp3/C$c;->b0()Lp3/I;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-static {v3, v5, v6, v7, v1}, Lk3/o;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lp3/y$c;Lp3/I;Ljava/lang/Integer;)Lk3/o;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {}, Lc3/f;->a()Lc3/y;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v2, v1, v3}, Lk3/i;->d(Lk3/o;Lc3/y;)Lc3/g;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    new-instance v1, Lc3/v$c;

    .line 66
    .line 67
    invoke-static/range {p2 .. p2}, Lc3/d;->a(Lp3/C$c;)[B

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-virtual/range {p2 .. p2}, Lp3/C$c;->c0()Lp3/z;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-virtual/range {p2 .. p2}, Lp3/C$c;->b0()Lp3/I;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    invoke-virtual/range {p2 .. p2}, Lp3/C$c;->a0()I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    invoke-virtual/range {p2 .. p2}, Lp3/C$c;->Z()Lp3/y;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Lp3/y;->a0()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    move-object v5, v1

    .line 92
    move-object v6, p0

    .line 93
    move-object v7, p1

    .line 94
    invoke-direct/range {v5 .. v13}, Lc3/v$c;-><init>(Ljava/lang/Object;Ljava/lang/Object;[BLp3/z;Lp3/I;ILjava/lang/String;Lc3/g;)V

    .line 95
    .line 96
    .line 97
    new-instance v2, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    new-instance v3, Lc3/v$d;

    .line 106
    .line 107
    invoke-virtual {v1}, Lc3/v$c;->b()[B

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-direct {v3, v5, v4}, Lc3/v$d;-><init>([BLc3/v$a;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Ljava/util/List;

    .line 123
    .line 124
    if-eqz v2, :cond_1

    .line 125
    .line 126
    new-instance v4, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {v4, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 132
    .line 133
    .line 134
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_1
    return-object v1
.end method

.method public static j(Ljava/lang/Class;)Lc3/v$b;
    .locals 2

    .line 1
    new-instance v0, Lc3/v$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lc3/v$b;-><init>(Ljava/lang/Class;Lc3/v$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public c()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/v;->a:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()Ln3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/v;->d:Ln3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Lc3/v$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/v;->b:Lc3/v$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public f([B)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lc3/v;->a:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    new-instance v1, Lc3/v$d;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, Lc3/v$d;-><init>([BLc3/v$a;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/util/List;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    return-object p1
.end method

.method public g()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/v;->c:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lc3/d;->a:[B

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lc3/v;->f([B)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/v;->d:Ln3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln3/a;->b()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    return v0
.end method
