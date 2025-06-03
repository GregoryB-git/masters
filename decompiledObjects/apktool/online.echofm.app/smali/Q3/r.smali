.class public abstract LQ3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ3/r$b;,
        LQ3/r$c;
    }
.end annotation


# direct methods
.method public static a()LQ3/r$c;
    .locals 3

    .line 1
    new-instance v0, LQ3/r$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2, v2}, LQ3/r$c;-><init>(ZLd4/n;LQ3/r$a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static b(LQ3/m;)LQ3/r$c;
    .locals 3

    .line 1
    new-instance v0, LQ3/r$c;

    .line 2
    .line 3
    invoke-virtual {p0}, LQ3/m;->b()Ld4/n;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {v0, v2, p0, v1}, LQ3/r$c;-><init>(ZLd4/n;LQ3/r$a;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
