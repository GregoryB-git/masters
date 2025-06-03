.class public final Lb1/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/m;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lb1/e0;

.field public c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lb1/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/g0;->a:Ljava/lang/String;

    iput-object p2, p0, Lb1/g0;->b:Lb1/e0;

    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb1/k$a;)V
    .locals 1

    sget-object v0, Lb1/k$a;->ON_DESTROY:Lb1/k$a;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x0

    iput-boolean p2, p0, Lb1/g0;->c:Z

    invoke-interface {p1}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object p1

    invoke-virtual {p1, p0}, Lb1/k;->c(Lb1/n;)V

    :cond_0
    return-void
.end method

.method public final b(Lb1/k;Ls1/c;)V
    .locals 2

    .line 1
    const-string v0, "registry"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lifecycle"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lb1/g0;->c:Z

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    xor-int/2addr v0, v1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iput-boolean v1, p0, Lb1/g0;->c:Z

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lb1/k;->a(Lb1/n;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lb1/g0;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v0, p0, Lb1/g0;->b:Lb1/e0;

    .line 25
    .line 26
    iget-object v0, v0, Lb1/e0;->e:Ls1/c$b;

    .line 27
    .line 28
    invoke-virtual {p2, p1, v0}, Ls1/c;->c(Ljava/lang/String;Ls1/c$b;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string p2, "Already attached to lifecycleOwner"

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
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
