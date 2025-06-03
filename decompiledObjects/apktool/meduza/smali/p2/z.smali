.class public final synthetic Lp2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt1/c$c;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/z;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final c(Lt1/c$b;)Lt1/c;
    .locals 6

    .line 1
    iget-object v1, p0, Lp2/z;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "$context"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p1, Lt1/c$b;->b:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v3, p1, Lt1/c$b;->c:Lt1/c$a;

    .line 11
    .line 12
    const-string p1, "callback"

    .line 13
    .line 14
    invoke-static {v3, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    move v0, p1

    .line 30
    :goto_1
    xor-int/2addr p1, v0

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    new-instance p1, Lu1/d;

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    move-object v0, p1

    .line 37
    move v4, v5

    .line 38
    invoke-direct/range {v0 .. v5}, Lu1/d;-><init>(Landroid/content/Context;Ljava/lang/String;Lt1/c$a;ZZ)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string v0, "Must set a non-null database name to a configuration that uses the no backup directory."

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
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
