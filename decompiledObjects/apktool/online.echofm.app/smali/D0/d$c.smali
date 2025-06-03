.class public final LD0/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:LD0/d;


# direct methods
.method public constructor <init>(LD0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD0/d$c;->a:LD0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LD0/d;LD0/d$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LD0/d$c;-><init>(LD0/d;)V

    return-void
.end method


# virtual methods
.method public b(Ld0/P;)V
    .locals 3

    .line 1
    iget-object v0, p0, LD0/d$c;->a:LD0/d;

    .line 2
    .line 3
    new-instance v1, Ld0/q$b;

    .line 4
    .line 5
    invoke-direct {v1}, Ld0/q$b;-><init>()V

    .line 6
    .line 7
    .line 8
    iget v2, p1, Ld0/P;->a:I

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ld0/q$b;->v0(I)Ld0/q$b;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget v2, p1, Ld0/P;->b:I

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ld0/q$b;->Y(I)Ld0/q$b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "video/raw"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ld0/q$b;->o0(Ljava/lang/String;)Ld0/q$b;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ld0/q$b;->K()Ld0/q;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, v1}, LD0/d;->l(LD0/d;Ld0/q;)Ld0/q;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, LD0/d$c;->a:LD0/d;

    .line 34
    .line 35
    invoke-static {v0}, LD0/d;->m(LD0/d;)Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, LD0/d$d;

    .line 54
    .line 55
    iget-object v2, p0, LD0/d$c;->a:LD0/d;

    .line 56
    .line 57
    invoke-interface {v1, v2, p1}, LD0/d$d;->b(LD0/d;Ld0/P;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-void
.end method

.method public c(JJJZ)V
    .locals 7

    .line 1
    if-eqz p7, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LD0/d$c;->a:LD0/d;

    .line 4
    .line 5
    invoke-static {p1}, LD0/d;->n(LD0/d;)Landroid/util/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LD0/d$c;->a:LD0/d;

    .line 12
    .line 13
    invoke-static {p1}, LD0/d;->m(LD0/d;)Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, LD0/d$d;

    .line 32
    .line 33
    iget-object p5, p0, LD0/d$c;->a:LD0/d;

    .line 34
    .line 35
    invoke-interface {p2, p5}, LD0/d$d;->d(LD0/d;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object p1, p0, LD0/d$c;->a:LD0/d;

    .line 40
    .line 41
    invoke-static {p1}, LD0/d;->o(LD0/d;)LD0/p;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    iget-object p1, p0, LD0/d$c;->a:LD0/d;

    .line 48
    .line 49
    invoke-static {p1}, LD0/d;->k(LD0/d;)Ld0/q;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    new-instance p1, Ld0/q$b;

    .line 56
    .line 57
    invoke-direct {p1}, Ld0/q$b;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ld0/q$b;->K()Ld0/q;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_1
    move-object v5, p1

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    iget-object p1, p0, LD0/d$c;->a:LD0/d;

    .line 67
    .line 68
    invoke-static {p1}, LD0/d;->k(LD0/d;)Ld0/q;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_1

    .line 73
    :goto_2
    iget-object p1, p0, LD0/d$c;->a:LD0/d;

    .line 74
    .line 75
    invoke-static {p1}, LD0/d;->o(LD0/d;)LD0/p;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object p1, p0, LD0/d$c;->a:LD0/d;

    .line 80
    .line 81
    invoke-static {p1}, LD0/d;->p(LD0/d;)Lg0/c;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-interface {p1}, Lg0/c;->c()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    const/4 v6, 0x0

    .line 90
    move-wide v1, p3

    .line 91
    invoke-interface/range {v0 .. v6}, LD0/p;->k(JJLd0/q;Landroid/media/MediaFormat;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    iget-object p1, p0, LD0/d$c;->a:LD0/d;

    .line 95
    .line 96
    invoke-static {p1}, LD0/d;->q(LD0/d;)Ld0/F;

    .line 97
    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    invoke-static {p1}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-static {p2}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    throw p1
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, LD0/d$c;->a:LD0/d;

    .line 2
    .line 3
    invoke-static {v0}, LD0/d;->m(LD0/d;)Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LD0/d$d;

    .line 22
    .line 23
    iget-object v2, p0, LD0/d$c;->a:LD0/d;

    .line 24
    .line 25
    invoke-interface {v1, v2}, LD0/d$d;->a(LD0/d;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, LD0/d$c;->a:LD0/d;

    .line 30
    .line 31
    invoke-static {v0}, LD0/d;->q(LD0/d;)Ld0/F;

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {v0}, Lg0/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method
