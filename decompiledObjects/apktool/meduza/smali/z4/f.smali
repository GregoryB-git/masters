.class public abstract Lz4/f;
.super Lz4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/f$a;,
        Lz4/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lz4/a;"
    }
.end annotation


# instance fields
.field public final p:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TT;",
            "Lz4/f$b<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public q:Landroid/os/Handler;

.field public r:Lt5/l0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lz4/a;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lz4/f;->p:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public abstract A(Ljava/lang/Object;Lv3/r1;)V
.end method

.method public final B(Lz4/h$d;Lz4/t;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lz4/f;->p:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    xor-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    invoke-static {v0}, Lx6/b;->q(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lz4/e;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Lz4/e;-><init>(Lz4/f;Lz4/h$d;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lz4/f$a;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1}, Lz4/f$a;-><init>(Lz4/f;Lz4/h$d;)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lz4/f;->p:Ljava/util/HashMap;

    .line 23
    .line 24
    new-instance v3, Lz4/f$b;

    .line 25
    .line 26
    invoke-direct {v3, p2, v0, v1}, Lz4/f$b;-><init>(Lz4/t;Lz4/e;Lz4/f$a;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lz4/f;->q:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-interface {p2, p1, v1}, Lz4/t;->n(Landroid/os/Handler;Lz4/w;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lz4/f;->q:Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-interface {p2, p1, v1}, Lz4/t;->d(Landroid/os/Handler;La4/g;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lz4/f;->r:Lt5/l0;

    .line 49
    .line 50
    iget-object v1, p0, Lz4/a;->o:Lw3/a0;

    .line 51
    .line 52
    invoke-static {v1}, Lx6/b;->K(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p2, v0, p1, v1}, Lz4/t;->e(Lz4/t$c;Lt5/l0;Lw3/a0;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lz4/a;->b:Ljava/util/HashSet;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    xor-int/lit8 p1, p1, 0x1

    .line 65
    .line 66
    if-nez p1, :cond_0

    .line 67
    .line 68
    invoke-interface {p2, v0}, Lz4/t;->l(Lz4/t$c;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-void
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
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lz4/f;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/f$b;

    iget-object v1, v1, Lz4/f$b;->a:Lz4/t;

    invoke-interface {v1}, Lz4/t;->h()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r()V
    .locals 3

    iget-object v0, p0, Lz4/f;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/f$b;

    iget-object v2, v1, Lz4/f$b;->a:Lz4/t;

    iget-object v1, v1, Lz4/f$b;->b:Lz4/t$c;

    invoke-interface {v2, v1}, Lz4/t;->l(Lz4/t$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public s()V
    .locals 3

    iget-object v0, p0, Lz4/f;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/f$b;

    iget-object v2, v1, Lz4/f$b;->a:Lz4/t;

    iget-object v1, v1, Lz4/f$b;->b:Lz4/t$c;

    invoke-interface {v2, v1}, Lz4/t;->b(Lz4/t$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w()V
    .locals 4

    iget-object v0, p0, Lz4/f;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/f$b;

    iget-object v2, v1, Lz4/f$b;->a:Lz4/t;

    iget-object v3, v1, Lz4/f$b;->b:Lz4/t$c;

    invoke-interface {v2, v3}, Lz4/t;->a(Lz4/t$c;)V

    iget-object v2, v1, Lz4/f$b;->a:Lz4/t;

    iget-object v3, v1, Lz4/f$b;->c:Lz4/f$a;

    invoke-interface {v2, v3}, Lz4/t;->m(Lz4/w;)V

    iget-object v2, v1, Lz4/f$b;->a:Lz4/t;

    iget-object v1, v1, Lz4/f$b;->c:Lz4/f$a;

    invoke-interface {v2, v1}, Lz4/t;->c(La4/g;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz4/f;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public abstract x(Ljava/lang/Object;Lz4/t$b;)Lz4/t$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lz4/t$b;",
            ")",
            "Lz4/t$b;"
        }
    .end annotation
.end method

.method public y(Ljava/lang/Object;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)J"
        }
    .end annotation

    return-wide p2
.end method

.method public abstract z(ILjava/lang/Object;)I
.end method
