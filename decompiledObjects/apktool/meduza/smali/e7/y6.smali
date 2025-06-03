.class public final Le7/y6;
.super Le7/h6;
.source "SourceFile"


# instance fields
.field public e:Ljava/lang/String;

.field public f:Ljava/util/HashSet;

.field public o:Lr/b;

.field public p:Ljava/lang/Long;

.field public q:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Le7/i6;)V
    .locals 0

    invoke-direct {p0, p1}, Le7/h6;-><init>(Le7/i6;)V

    return-void
.end method


# virtual methods
.method public final r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final s(Ljava/lang/Integer;)Le7/a7;
    .locals 2

    .line 1
    iget-object v0, p0, Le7/y6;->o:Lr/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr/h;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Le7/y6;->o:Lr/b;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Lr/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Le7/a7;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    new-instance v0, Le7/a7;

    .line 20
    .line 21
    iget-object v1, p0, Le7/y6;->e:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, Le7/a7;-><init>(Le7/y6;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Le7/y6;->o:Lr/b;

    .line 27
    .line 28
    invoke-virtual {v1, p1, v0}, Lr/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v0
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
