.class public final Lx0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lx0/S;
    .locals 3

    .line 1
    new-instance v0, Lx0/i;

    .line 2
    .line 3
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, LX2/v;->Y()LX2/v;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, v1, v2}, Lx0/i;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public b(Ljava/util/List;Ljava/util/List;)Lx0/S;
    .locals 1

    .line 1
    new-instance v0, Lx0/i;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lx0/i;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
