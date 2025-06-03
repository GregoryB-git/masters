.class public final Lk9/a$b;
.super Lk9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lka/d0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lk9/a;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final d(Lka/d0;)Lka/d0;
    .locals 3

    .line 1
    invoke-static {p1}, Lj9/s;->h(Lka/d0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lka/d0;->R()Lka/b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lma/w;->E()Lma/w$a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lka/b$a;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {}, Lka/b;->M()Lka/b$a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    iget-object v0, p0, Lk9/a;->a:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lka/d0;

    .line 39
    .line 40
    invoke-static {p1, v1}, Lj9/s;->f(Lka/c;Lka/d0;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Lma/w$a;->m()V

    .line 47
    .line 48
    .line 49
    iget-object v2, p1, Lma/w$a;->b:Lma/w;

    .line 50
    .line 51
    check-cast v2, Lka/b;

    .line 52
    .line 53
    invoke-static {v2, v1}, Lka/b;->G(Lka/b;Lka/d0;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-static {}, Lka/d0;->d0()Lka/d0$a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0, p1}, Lka/d0$a;->p(Lka/b$a;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lma/w$a;->k()Lma/w;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lka/d0;

    .line 69
    .line 70
    return-object p1
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
