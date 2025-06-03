.class public abstract Le2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)Le2/j;
    .locals 1

    .line 1
    new-instance v0, Le2/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Le2/d;-><init>(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static b()Lj4/a;
    .locals 2

    .line 1
    new-instance v0, Ll4/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ll4/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Le2/b;->a:Lk4/a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ll4/d;->j(Lk4/a;)Ll4/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Ll4/d;->k(Z)Ll4/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ll4/d;->i()Lj4/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
.end method
