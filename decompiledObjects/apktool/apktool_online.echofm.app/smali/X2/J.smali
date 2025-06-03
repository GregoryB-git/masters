.class public abstract LX2/J;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX2/J$c;,
        LX2/J$d;,
        LX2/J$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LX2/I;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LX2/J;-><init>()V

    return-void
.end method

.method public static a()LX2/J$d;
    .locals 1

    .line 1
    invoke-static {}, LX2/P;->d()LX2/P;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LX2/J;->b(Ljava/util/Comparator;)LX2/J$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static b(Ljava/util/Comparator;)LX2/J$d;
    .locals 1

    .line 1
    invoke-static {p0}, LW2/m;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    new-instance v0, LX2/J$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LX2/J$a;-><init>(Ljava/util/Comparator;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
