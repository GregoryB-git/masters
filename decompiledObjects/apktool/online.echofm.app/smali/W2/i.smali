.class public abstract LW2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW2/i$b;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/Object;)LW2/i$b;
    .locals 2

    .line 1
    new-instance v0, LW2/i$b;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, LW2/i$b;-><init>(Ljava/lang/String;LW2/i$a;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
