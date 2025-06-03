.class public final Lc2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[Lc2/k;

.field public final b:Ljava/lang/String;

.field public final c:[B

.field public final d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lc2/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/j;->b:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lc2/j;->c:[B

    iput-object p2, p0, Lc2/j;->a:[Lc2/k;

    const/4 p1, 0x0

    iput p1, p0, Lc2/j;->d:I

    return-void
.end method

.method public constructor <init>([B[Lc2/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lc2/j;->c:[B

    const/4 p1, 0x0

    iput-object p1, p0, Lc2/j;->b:Ljava/lang/String;

    iput-object p2, p0, Lc2/j;->a:[Lc2/k;

    const/4 p1, 0x1

    iput p1, p0, Lc2/j;->d:I

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 7

    .line 1
    iget v0, p0, Lc2/j;->d:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Wrong data accessor type detected. "

    .line 9
    .line 10
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget v2, p0, Lc2/j;->d:I

    .line 15
    .line 16
    const-string v3, "Unknown"

    .line 17
    .line 18
    const-string v4, "ArrayBuffer"

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    const-string v6, "String"

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    if-eq v2, v5, :cond_1

    .line 26
    .line 27
    move-object v2, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v2, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move-object v2, v6

    .line 32
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, " expected, but got "

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    if-eq p1, v5, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    move-object v3, v4

    .line 46
    goto :goto_1

    .line 47
    :cond_4
    move-object v3, v6

    .line 48
    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
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
