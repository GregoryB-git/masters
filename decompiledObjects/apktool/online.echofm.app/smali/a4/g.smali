.class public La4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LV3/j;

.field public final b:Lc4/c;


# direct methods
.method public constructor <init>(LV3/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LV3/f;->o()LV3/j;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, La4/g;->a:LV3/j;

    .line 9
    .line 10
    const-string v0, "EventRaiser"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, LV3/f;->q(Ljava/lang/String;)Lc4/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La4/g;->b:Lc4/c;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(La4/g;)Lc4/c;
    .locals 0

    .line 1
    iget-object p0, p0, La4/g;->b:Lc4/c;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b(Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object v0, p0, La4/g;->b:Lc4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc4/c;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La4/g;->b:Lc4/c;

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "Raising "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, " event(s)"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x0

    .line 38
    new-array v2, v2, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Lc4/c;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, La4/g;->a:LV3/j;

    .line 49
    .line 50
    new-instance v1, La4/g$a;

    .line 51
    .line 52
    invoke-direct {v1, p0, v0}, La4/g$a;-><init>(La4/g;Ljava/util/ArrayList;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1, v1}, LV3/j;->b(Ljava/lang/Runnable;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
