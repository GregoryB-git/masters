.class public final Lsc/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld2/h0;

.field public static final b:Lsc/w$a;

.field public static final c:Lsc/w$b;

.field public static final d:Lsc/w$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld2/h0;

    const-string v1, "NO_THREAD_ELEMENTS"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lsc/w;->a:Ld2/h0;

    sget-object v0, Lsc/w$a;->a:Lsc/w$a;

    sput-object v0, Lsc/w;->b:Lsc/w$a;

    sget-object v0, Lsc/w$b;->a:Lsc/w$b;

    sput-object v0, Lsc/w;->c:Lsc/w$b;

    sget-object v0, Lsc/w$c;->a:Lsc/w$c;

    sput-object v0, Lsc/w;->d:Lsc/w$c;

    return-void
.end method

.method public static final a(Lub/h;Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object v0, Lsc/w;->a:Ld2/h0;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    instance-of v0, p1, Lsc/z;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    check-cast p1, Lsc/z;

    .line 11
    .line 12
    iget-object p0, p1, Lsc/z;->c:[Lnc/b2;

    .line 13
    .line 14
    array-length p0, p0

    .line 15
    add-int/lit8 p0, p0, -0x1

    .line 16
    .line 17
    if-ltz p0, :cond_3

    .line 18
    .line 19
    :goto_0
    add-int/lit8 v0, p0, -0x1

    .line 20
    .line 21
    iget-object v1, p1, Lsc/z;->c:[Lnc/b2;

    .line 22
    .line 23
    aget-object v1, v1, p0

    .line 24
    .line 25
    invoke-static {v1}, Lec/i;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p1, Lsc/z;->b:[Ljava/lang/Object;

    .line 29
    .line 30
    aget-object p0, v2, p0

    .line 31
    .line 32
    invoke-interface {v1, p0}, Lnc/b2;->k0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    if-gez v0, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move p0, v0

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    sget-object v1, Lsc/w;->c:Lsc/w$b;

    .line 42
    .line 43
    invoke-interface {p0, v0, v1}, Lub/h;->fold(Ljava/lang/Object;Ldc/p;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    .line 48
    .line 49
    invoke-static {p0, v0}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    check-cast p0, Lnc/b2;

    .line 53
    .line 54
    invoke-interface {p0, p1}, Lnc/b2;->k0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_1
    return-void
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

.method public static final b(Lub/h;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lsc/w;->b:Lsc/w$a;

    invoke-interface {p0, v0, v1}, Lub/h;->fold(Ljava/lang/Object;Ldc/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lec/i;->b(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final c(Lub/h;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lsc/w;->b(Lub/h;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lsc/w;->a:Ld2/h0;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lsc/z;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lsc/z;-><init>(Lub/h;I)V

    sget-object p1, Lsc/w;->d:Lsc/w$c;

    invoke-interface {p0, v0, p1}, Lub/h;->fold(Ljava/lang/Object;Ldc/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    check-cast p1, Lnc/b2;

    invoke-interface {p1, p0}, Lnc/b2;->M(Lub/h;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method
