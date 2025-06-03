.class public abstract Lj9/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj9/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lj9/k$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lj9/b;

.field public static final b:Lq5/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lj9/q;->b:Lj9/q;

    .line 2
    .line 3
    invoke-static {}, Lj9/i;->g()Lj9/i;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Lj9/b;

    .line 8
    .line 9
    const/4 v3, -0x1

    .line 10
    invoke-direct {v2, v0, v1, v3}, Lj9/b;-><init>(Lj9/q;Lj9/i;I)V

    .line 11
    .line 12
    .line 13
    sput-object v2, Lj9/k$a;->a:Lj9/b;

    .line 14
    .line 15
    new-instance v0, Lq5/i;

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    invoke-direct {v0, v1}, Lq5/i;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lj9/k$a;->b:Lq5/i;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g(Lj9/g;)Lj9/b;
    .locals 3

    invoke-interface {p0}, Lj9/g;->f()Lj9/q;

    move-result-object v0

    invoke-interface {p0}, Lj9/g;->getKey()Lj9/i;

    move-result-object p0

    new-instance v1, Lj9/b;

    const/4 v2, -0x1

    invoke-direct {v1, v0, p0, v2}, Lj9/b;-><init>(Lj9/q;Lj9/i;I)V

    return-object v1
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj9/k$a;

    invoke-virtual {p0, p1}, Lj9/k$a;->f(Lj9/k$a;)I

    move-result p1

    return p1
.end method

.method public final f(Lj9/k$a;)I
    .locals 2

    invoke-virtual {p0}, Lj9/k$a;->l()Lj9/q;

    move-result-object v0

    invoke-virtual {p1}, Lj9/k$a;->l()Lj9/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj9/q;->f(Lj9/q;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lj9/k$a;->h()Lj9/i;

    move-result-object v0

    invoke-virtual {p1}, Lj9/k$a;->h()Lj9/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj9/i;->f(Lj9/i;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Lj9/k$a;->i()I

    move-result v0

    invoke-virtual {p1}, Lj9/k$a;->i()I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public abstract h()Lj9/i;
.end method

.method public abstract i()I
.end method

.method public abstract l()Lj9/q;
.end method
