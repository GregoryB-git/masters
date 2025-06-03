.class public final Lg9/x;
.super Lg9/l;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lj9/l;Lka/d0;)V
    .locals 1

    sget-object v0, Lg9/l$a;->r:Lg9/l$a;

    invoke-direct {p0, p1, v0, p2}, Lg9/l;-><init>(Lj9/l;Lg9/l$a;Lka/d0;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lg9/x;->d:Ljava/util/ArrayList;

    invoke-static {v0, p2}, Lg9/x;->h(Lg9/l$a;Lka/d0;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static h(Lg9/l$a;Lka/d0;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    sget-object v0, Lg9/l$a;->r:Lg9/l$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    sget-object v0, Lg9/l$a;->s:Lg9/l$a;

    .line 7
    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 14
    :goto_1
    new-array v2, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    const-string v3, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators"

    .line 17
    .line 18
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lj9/s;->h(Lka/d0;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    new-array v2, v1, [Ljava/lang/Object;

    .line 26
    .line 27
    const-string v3, "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue"

    .line 28
    .line 29
    invoke-static {v3, v0, v2}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lka/d0;->R()Lka/b;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lka/b;->h()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lka/d0;

    .line 60
    .line 61
    invoke-static {v2}, Lj9/s;->k(Lka/d0;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const-string v4, "Comparing on key with "

    .line 66
    .line 67
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iget-object v5, p0, Lg9/l$a;->a:Ljava/lang/String;

    .line 72
    .line 73
    const-string v6, ", but an array value was not a ReferenceValue"

    .line 74
    .line 75
    invoke-static {v4, v5, v6}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    new-array v5, v1, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-static {v4, v3, v5}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Lka/d0;->Z()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v2}, Lj9/i;->h(Ljava/lang/String;)Lj9/i;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    return-object v0
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method


# virtual methods
.method public final d(Lj9/g;)Z
    .locals 1

    iget-object v0, p0, Lg9/x;->d:Ljava/util/ArrayList;

    invoke-interface {p1}, Lj9/g;->getKey()Lj9/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
