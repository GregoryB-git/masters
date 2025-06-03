.class public abstract Lc2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/Object;)Lc2/c;
    .locals 3

    .line 1
    new-instance v0, Lc2/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lc2/d;->o:Lc2/d;

    .line 5
    .line 6
    invoke-direct {v0, v1, p0, v2}, Lc2/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Lc2/d;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static e(Ljava/lang/Object;)Lc2/c;
    .locals 3

    .line 1
    new-instance v0, Lc2/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lc2/d;->q:Lc2/d;

    .line 5
    .line 6
    invoke-direct {v0, v1, p0, v2}, Lc2/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Lc2/d;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Ljava/lang/Object;
.end method

.method public abstract c()Lc2/d;
.end method
