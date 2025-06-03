.class public LD5/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD5/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LD5/s;


# direct methods
.method public constructor <init>(LD5/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD5/s$b;->a:LD5/s;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onMethodCall(LE5/j;LE5/k$d;)V
    .locals 2

    .line 1
    iget-object v0, p1, LE5/j;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, LE5/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    const-string v1, "get"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    const-string v1, "put"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-interface {p2}, LE5/k$d;->c()V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    iget-object v0, p0, LD5/s$b;->a:LD5/s;

    .line 29
    .line 30
    check-cast p1, [B

    .line 31
    .line 32
    invoke-static {v0, p1}, LD5/s;->b(LD5/s;[B)[B

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    :goto_0
    invoke-interface {p2, p1}, LE5/k$d;->a(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    iget-object p1, p0, LD5/s$b;->a:LD5/s;

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    invoke-static {p1, v0}, LD5/s;->c(LD5/s;Z)Z

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, LD5/s$b;->a:LD5/s;

    .line 47
    .line 48
    invoke-static {p1}, LD5/s;->d(LD5/s;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    iget-object p1, p0, LD5/s$b;->a:LD5/s;

    .line 55
    .line 56
    iget-boolean v0, p1, LD5/s;->a:Z

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-static {p1, p2}, LD5/s;->f(LD5/s;LE5/k$d;)LE5/k$d;

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    :goto_1
    iget-object p1, p0, LD5/s$b;->a:LD5/s;

    .line 66
    .line 67
    invoke-static {p1}, LD5/s;->a(LD5/s;)[B

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {p1, v0}, LD5/s;->e(LD5/s;[B)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto :goto_0

    .line 76
    :goto_2
    return-void
.end method
