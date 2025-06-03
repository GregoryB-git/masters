.class public abstract LX2/K;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/K$a;
    }
.end annotation


# direct methods
.method public static a(LX2/H;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, LX2/H;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, LX2/H;

    .line 10
    .line 11
    invoke-interface {p0}, LX2/H;->a()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p1}, LX2/H;->a()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static b(Ljava/util/Map;LW2/s;)LX2/D;
    .locals 1

    .line 1
    new-instance v0, LX2/K$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LX2/K$a;-><init>(Ljava/util/Map;LW2/s;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
