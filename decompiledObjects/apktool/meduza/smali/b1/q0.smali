.class public final Lb1/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/q0$a;,
        Lb1/q0$b;,
        Lb1/q0$c;,
        Lb1/q0$d;
    }
.end annotation


# instance fields
.field public final a:Lb1/s0;

.field public final b:Lb1/q0$b;

.field public final c:Lc1/a;


# direct methods
.method public constructor <init>(Lb1/s0;Lb1/q0$b;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lc1/a$a;->b:Lc1/a$a;

    invoke-direct {p0, p1, p2, v0}, Lb1/q0;-><init>(Lb1/s0;Lb1/q0$b;Lc1/a;)V

    return-void
.end method

.method public constructor <init>(Lb1/s0;Lb1/q0$b;Lc1/a;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/q0;->a:Lb1/s0;

    iput-object p2, p0, Lb1/q0;->b:Lb1/q0$b;

    iput-object p3, p0, Lb1/q0;->c:Lc1/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lb1/o0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lb1/o0;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lb1/q0;->b(Ljava/lang/Class;Ljava/lang/String;)Lb1/o0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/lang/Class;Ljava/lang/String;)Lb1/o0;
    .locals 3

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb1/q0;->a:Lb1/s0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lb1/s0;->a:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lb1/o0;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lb1/q0;->b:Lb1/q0$b;

    .line 26
    .line 27
    instance-of p2, p1, Lb1/q0$d;

    .line 28
    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    check-cast p1, Lb1/q0$d;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    :goto_0
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lb1/q0$d;->c(Lb1/o0;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 44
    .line 45
    invoke-static {v0, p1}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    new-instance v0, Lc1/b;

    .line 50
    .line 51
    iget-object v1, p0, Lb1/q0;->c:Lc1/a;

    .line 52
    .line 53
    invoke-direct {v0, v1}, Lc1/b;-><init>(Lc1/a;)V

    .line 54
    .line 55
    .line 56
    sget-object v1, Lb1/r0;->a:Lb1/r0;

    .line 57
    .line 58
    iget-object v2, v0, Lc1/a;->a:Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    invoke-interface {v2, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :try_start_0
    iget-object v1, p0, Lb1/q0;->b:Lb1/q0$b;

    .line 64
    .line 65
    invoke-interface {v1, p1, v0}, Lb1/q0$b;->b(Ljava/lang/Class;Lc1/b;)Lb1/o0;

    .line 66
    .line 67
    .line 68
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    goto :goto_1

    .line 70
    :catch_0
    iget-object v0, p0, Lb1/q0;->b:Lb1/q0$b;

    .line 71
    .line 72
    invoke-interface {v0, p1}, Lb1/q0$b;->a(Ljava/lang/Class;)Lb1/o0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_1
    iget-object v0, p0, Lb1/q0;->a:Lb1/s0;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    const-string v1, "viewModel"

    .line 82
    .line 83
    invoke-static {p1, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, v0, Lb1/s0;->a:Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    check-cast p2, Lb1/o0;

    .line 93
    .line 94
    if-eqz p2, :cond_3

    .line 95
    .line 96
    invoke-virtual {p2}, Lb1/o0;->b()V

    .line 97
    .line 98
    .line 99
    :cond_3
    return-object p1
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
