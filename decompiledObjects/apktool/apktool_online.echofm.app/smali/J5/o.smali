.class public abstract synthetic LJ5/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()LE5/i;
    .locals 1

    .line 1
    new-instance v0, LE5/p;

    .line 2
    .line 3
    invoke-direct {v0}, LE5/p;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b(LJ5/p$a;Ljava/lang/Object;LE5/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Boolean;

    .line 21
    .line 22
    new-instance v2, LJ5/o$a;

    .line 23
    .line 24
    invoke-direct {v2, v0, p2}, LJ5/o$a;-><init>(Ljava/util/ArrayList;LE5/a$e;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v1, p1, v2}, LJ5/p$a;->f(Ljava/lang/String;Ljava/lang/Boolean;LJ5/p$f;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic c(LJ5/p$a;Ljava/lang/Object;LE5/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Boolean;

    .line 21
    .line 22
    new-instance v2, LJ5/o$b;

    .line 23
    .line 24
    invoke-direct {v2, v0, p2}, LJ5/o$b;-><init>(Ljava/util/ArrayList;LE5/a$e;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v1, p1, v2}, LJ5/p$a;->b(Ljava/lang/String;Ljava/lang/Boolean;LJ5/p$f;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic d(LJ5/p$a;Ljava/lang/Object;LE5/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    new-instance v1, LJ5/o$c;

    .line 16
    .line 17
    invoke-direct {v1, v0, p2}, LJ5/o$c;-><init>(Ljava/util/ArrayList;LE5/a$e;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, p1, v1}, LJ5/p$a;->d(Ljava/lang/String;LJ5/p$f;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static e(LE5/c;LJ5/p$a;)V
    .locals 4

    .line 1
    new-instance v0, LE5/a;

    .line 2
    .line 3
    const-string v1, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled"

    .line 4
    .line 5
    invoke-static {}, LJ5/o;->a()LE5/i;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, p0, v1, v2}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    new-instance v2, LJ5/l;

    .line 16
    .line 17
    invoke-direct {v2, p1}, LJ5/l;-><init>(LJ5/p$a;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, LE5/a;->e(LE5/a$d;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0, v1}, LE5/a;->e(LE5/a$d;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    new-instance v0, LE5/a;

    .line 28
    .line 29
    const-string v2, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled"

    .line 30
    .line 31
    invoke-static {}, LJ5/o;->a()LE5/i;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-direct {v0, p0, v2, v3}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    .line 36
    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    new-instance v2, LJ5/m;

    .line 41
    .line 42
    invoke-direct {v2, p1}, LJ5/m;-><init>(LJ5/p$a;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2}, LE5/a;->e(LE5/a$d;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v0, v1}, LE5/a;->e(LE5/a$d;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    new-instance v0, LE5/a;

    .line 53
    .line 54
    const-string v2, "dev.flutter.pigeon.FirebaseAppHostApi.delete"

    .line 55
    .line 56
    invoke-static {}, LJ5/o;->a()LE5/i;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-direct {v0, p0, v2, v3}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    new-instance p0, LJ5/n;

    .line 66
    .line 67
    invoke-direct {p0, p1}, LJ5/n;-><init>(LJ5/p$a;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p0}, LE5/a;->e(LE5/a$d;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v0, v1}, LE5/a;->e(LE5/a$d;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    return-void
.end method
