.class public abstract Lz6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LV2/j;LX5/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1}, Lz6/b;->b(LV2/j;LV2/a;LX5/d;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static final b(LV2/j;LV2/a;LX5/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, LV2/j;->m()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, LV2/j;->i()Ljava/lang/Exception;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LV2/j;->l()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, LV2/j;->j()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 25
    .line 26
    new-instance p2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v0, "Task "

    .line 32
    .line 33
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, " was cancelled normally."

    .line 40
    .line 41
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {p1, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_1
    throw p1

    .line 53
    :cond_2
    new-instance p1, Lp6/m;

    .line 54
    .line 55
    invoke-static {p2}, LY5/b;->b(LX5/d;)LX5/d;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v1, 0x1

    .line 60
    invoke-direct {p1, v0, v1}, Lp6/m;-><init>(LX5/d;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lp6/m;->z()V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lz6/a;->o:Lz6/a;

    .line 67
    .line 68
    new-instance v1, Lz6/b$a;

    .line 69
    .line 70
    invoke-direct {v1, p1}, Lz6/b$a;-><init>(Lp6/l;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0, v1}, LV2/j;->c(Ljava/util/concurrent/Executor;LV2/e;)LV2/j;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lp6/m;->w()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p0, p1, :cond_3

    .line 85
    .line 86
    invoke-static {p2}, LZ5/h;->c(LX5/d;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    return-object p0
.end method
