.class public abstract LW2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW2/t$c;,
        LW2/t$b;,
        LW2/t$a;
    }
.end annotation


# direct methods
.method public static a(LW2/s;)LW2/s;
    .locals 1

    .line 1
    instance-of v0, p0, LW2/t$b;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p0, LW2/t$a;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, LW2/t$a;

    .line 15
    .line 16
    invoke-direct {v0, p0}, LW2/t$a;-><init>(LW2/s;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    new-instance v0, LW2/t$b;

    .line 21
    .line 22
    invoke-direct {v0, p0}, LW2/t$b;-><init>(LW2/s;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-object v0

    .line 26
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)LW2/s;
    .locals 1

    .line 1
    new-instance v0, LW2/t$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LW2/t$c;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
