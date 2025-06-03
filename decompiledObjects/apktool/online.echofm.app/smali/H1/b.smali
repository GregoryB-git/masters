.class public final LH1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH1/b$a;
    }
.end annotation


# static fields
.field public static final m:LH1/b$a;

.field public static final n:Ljava/util/Map;


# instance fields
.field public final a:LH1/a;

.field public final b:LH1/a;

.field public final c:LH1/a;

.field public final d:LH1/a;

.field public final e:LH1/a;

.field public final f:LH1/a;

.field public final g:LH1/a;

.field public final h:LH1/a;

.field public final i:LH1/a;

.field public final j:LH1/a;

.field public final k:LH1/a;

.field public final l:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, LH1/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LH1/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LH1/b;->m:LH1/b$a;

    .line 8
    .line 9
    const-string v0, "embedding.weight"

    .line 10
    .line 11
    const-string v1, "embed.weight"

    .line 12
    .line 13
    invoke-static {v0, v1}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "dense1.weight"

    .line 18
    .line 19
    const-string v2, "fc1.weight"

    .line 20
    .line 21
    invoke-static {v1, v2}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "dense2.weight"

    .line 26
    .line 27
    const-string v3, "fc2.weight"

    .line 28
    .line 29
    invoke-static {v2, v3}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "dense3.weight"

    .line 34
    .line 35
    const-string v4, "fc3.weight"

    .line 36
    .line 37
    invoke-static {v3, v4}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v4, "dense1.bias"

    .line 42
    .line 43
    const-string v5, "fc1.bias"

    .line 44
    .line 45
    invoke-static {v4, v5}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-string v5, "dense2.bias"

    .line 50
    .line 51
    const-string v6, "fc2.bias"

    .line 52
    .line 53
    invoke-static {v5, v6}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    const-string v6, "dense3.bias"

    .line 58
    .line 59
    const-string v7, "fc3.bias"

    .line 60
    .line 61
    invoke-static {v6, v7}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    const/4 v7, 0x7

    .line 66
    new-array v7, v7, [LV5/m;

    .line 67
    .line 68
    const/4 v8, 0x0

    .line 69
    aput-object v0, v7, v8

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    aput-object v1, v7, v0

    .line 73
    .line 74
    const/4 v0, 0x2

    .line 75
    aput-object v2, v7, v0

    .line 76
    .line 77
    const/4 v0, 0x3

    .line 78
    aput-object v3, v7, v0

    .line 79
    .line 80
    const/4 v0, 0x4

    .line 81
    aput-object v4, v7, v0

    .line 82
    .line 83
    const/4 v0, 0x5

    .line 84
    aput-object v5, v7, v0

    .line 85
    .line 86
    const/4 v0, 0x6

    .line 87
    aput-object v6, v7, v0

    .line 88
    .line 89
    invoke-static {v7}, LW5/C;->e([LV5/m;)Ljava/util/HashMap;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sput-object v0, LH1/b;->n:Ljava/util/Map;

    .line 94
    .line 95
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "embed.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Required value was null."

    if-eqz v0, :cond_d

    check-cast v0, LH1/a;

    iput-object v0, p0, LH1/b;->a:LH1/a;

    sget-object v0, LH1/i;->a:LH1/i;

    const-string v0, "convs.0.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_c

    check-cast v0, LH1/a;

    invoke-static {v0}, LH1/i;->l(LH1/a;)LH1/a;

    move-result-object v0

    iput-object v0, p0, LH1/b;->b:LH1/a;

    const-string v0, "convs.1.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_b

    check-cast v0, LH1/a;

    invoke-static {v0}, LH1/i;->l(LH1/a;)LH1/a;

    move-result-object v0

    iput-object v0, p0, LH1/b;->c:LH1/a;

    const-string v0, "convs.2.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_a

    check-cast v0, LH1/a;

    invoke-static {v0}, LH1/i;->l(LH1/a;)LH1/a;

    move-result-object v0

    iput-object v0, p0, LH1/b;->d:LH1/a;

    const-string v0, "convs.0.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    check-cast v0, LH1/a;

    iput-object v0, p0, LH1/b;->e:LH1/a;

    const-string v0, "convs.1.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    check-cast v0, LH1/a;

    iput-object v0, p0, LH1/b;->f:LH1/a;

    const-string v0, "convs.2.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    check-cast v0, LH1/a;

    iput-object v0, p0, LH1/b;->g:LH1/a;

    const-string v0, "fc1.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    check-cast v0, LH1/a;

    invoke-static {v0}, LH1/i;->k(LH1/a;)LH1/a;

    move-result-object v0

    iput-object v0, p0, LH1/b;->h:LH1/a;

    const-string v0, "fc2.weight"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, LH1/a;

    invoke-static {v0}, LH1/i;->k(LH1/a;)LH1/a;

    move-result-object v0

    iput-object v0, p0, LH1/b;->i:LH1/a;

    const-string v0, "fc1.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, LH1/a;

    iput-object v0, p0, LH1/b;->j:LH1/a;

    const-string v0, "fc2.bias"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, LH1/a;

    iput-object v0, p0, LH1/b;->k:LH1/a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LH1/b;->l:Ljava/util/Map;

    sget-object v0, LH1/f$a;->o:LH1/f$a;

    invoke-virtual {v0}, LH1/f$a;->e()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LH1/f$a;->p:LH1/f$a;

    invoke-virtual {v1}, LH1/f$a;->e()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW5/I;->f([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, ".weight"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ".bias"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LH1/a;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LH1/a;

    if-eqz v3, :cond_1

    invoke-static {v3}, LH1/i;->k(LH1/a;)LH1/a;

    move-result-object v3

    iget-object v5, p0, LH1/b;->l:Ljava/util/Map;

    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz v4, :cond_0

    iget-object v2, p0, LH1/b;->l:Ljava/util/Map;

    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Lkotlin/jvm/internal/g;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LH1/b;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static final synthetic a()Ljava/util/Map;
    .locals 3

    .line 1
    const-class v0, LH1/b;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    :try_start_0
    sget-object v0, LH1/b;->n:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    invoke-static {v1, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object v2
.end method


# virtual methods
.method public final b(LH1/a;[Ljava/lang/String;Ljava/lang/String;)LH1/a;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-static {p0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    return-object v3

    .line 11
    :cond_0
    :try_start_0
    const-string v2, "dense"

    .line 12
    .line 13
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "texts"

    .line 17
    .line 18
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v2, "task"

    .line 22
    .line 23
    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object v2, LH1/i;->a:LH1/i;

    .line 27
    .line 28
    iget-object v2, p0, LH1/b;->a:LH1/a;

    .line 29
    .line 30
    const/16 v4, 0x80

    .line 31
    .line 32
    invoke-static {p2, v4, v2}, LH1/i;->e([Ljava/lang/String;ILH1/a;)LH1/a;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iget-object v2, p0, LH1/b;->b:LH1/a;

    .line 37
    .line 38
    invoke-static {p2, v2}, LH1/i;->c(LH1/a;LH1/a;)LH1/a;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iget-object v2, p0, LH1/b;->e:LH1/a;

    .line 43
    .line 44
    invoke-static {p2, v2}, LH1/i;->a(LH1/a;LH1/a;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p2}, LH1/i;->i(LH1/a;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, LH1/b;->c:LH1/a;

    .line 51
    .line 52
    invoke-static {p2, v2}, LH1/i;->c(LH1/a;LH1/a;)LH1/a;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v4, p0, LH1/b;->f:LH1/a;

    .line 57
    .line 58
    invoke-static {v2, v4}, LH1/i;->a(LH1/a;LH1/a;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v2}, LH1/i;->i(LH1/a;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v1}, LH1/i;->g(LH1/a;I)LH1/a;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-object v4, p0, LH1/b;->d:LH1/a;

    .line 69
    .line 70
    invoke-static {v2, v4}, LH1/i;->c(LH1/a;LH1/a;)LH1/a;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iget-object v5, p0, LH1/b;->g:LH1/a;

    .line 75
    .line 76
    invoke-static {v4, v5}, LH1/i;->a(LH1/a;LH1/a;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v4}, LH1/i;->i(LH1/a;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v0}, LH1/a;->b(I)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-static {p2, v5}, LH1/i;->g(LH1/a;I)LH1/a;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {v2, v0}, LH1/a;->b(I)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-static {v2, v5}, LH1/i;->g(LH1/a;I)LH1/a;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v4, v0}, LH1/a;->b(I)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    invoke-static {v4, v5}, LH1/i;->g(LH1/a;I)LH1/a;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {p2, v0}, LH1/i;->f(LH1/a;I)V

    .line 107
    .line 108
    .line 109
    invoke-static {v2, v0}, LH1/i;->f(LH1/a;I)V

    .line 110
    .line 111
    .line 112
    invoke-static {v4, v0}, LH1/i;->f(LH1/a;I)V

    .line 113
    .line 114
    .line 115
    const/4 v5, 0x4

    .line 116
    new-array v5, v5, [LH1/a;

    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    aput-object p2, v5, v6

    .line 120
    .line 121
    aput-object v2, v5, v0

    .line 122
    .line 123
    aput-object v4, v5, v1

    .line 124
    .line 125
    const/4 p2, 0x3

    .line 126
    aput-object p1, v5, p2

    .line 127
    .line 128
    invoke-static {v5}, LH1/i;->b([LH1/a;)LH1/a;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget-object p2, p0, LH1/b;->h:LH1/a;

    .line 133
    .line 134
    iget-object v0, p0, LH1/b;->j:LH1/a;

    .line 135
    .line 136
    invoke-static {p1, p2, v0}, LH1/i;->d(LH1/a;LH1/a;LH1/a;)LH1/a;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p1}, LH1/i;->i(LH1/a;)V

    .line 141
    .line 142
    .line 143
    iget-object p2, p0, LH1/b;->i:LH1/a;

    .line 144
    .line 145
    iget-object v0, p0, LH1/b;->k:LH1/a;

    .line 146
    .line 147
    invoke-static {p1, p2, v0}, LH1/i;->d(LH1/a;LH1/a;LH1/a;)LH1/a;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p1}, LH1/i;->i(LH1/a;)V

    .line 152
    .line 153
    .line 154
    iget-object p2, p0, LH1/b;->l:Ljava/util/Map;

    .line 155
    .line 156
    const-string v0, ".weight"

    .line 157
    .line 158
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    check-cast p2, LH1/a;

    .line 167
    .line 168
    iget-object v0, p0, LH1/b;->l:Ljava/util/Map;

    .line 169
    .line 170
    const-string v1, ".bias"

    .line 171
    .line 172
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    check-cast p3, LH1/a;

    .line 181
    .line 182
    if-eqz p2, :cond_2

    .line 183
    .line 184
    if-nez p3, :cond_1

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_1
    invoke-static {p1, p2, p3}, LH1/i;->d(LH1/a;LH1/a;LH1/a;)LH1/a;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {p1}, LH1/i;->j(LH1/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    .line 193
    .line 194
    return-object p1

    .line 195
    :catchall_0
    move-exception p1

    .line 196
    goto :goto_1

    .line 197
    :cond_2
    :goto_0
    return-object v3

    .line 198
    :goto_1
    invoke-static {p1, p0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    return-object v3
.end method
