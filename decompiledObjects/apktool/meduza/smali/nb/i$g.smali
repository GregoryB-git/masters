.class public final Lnb/i$g;
.super Leb/k0$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb/i$g$a;
    }
.end annotation


# instance fields
.field public final a:Leb/k0$j;


# direct methods
.method public constructor <init>(Leb/k0$j;)V
    .locals 0

    invoke-direct {p0}, Leb/k0$j;-><init>()V

    iput-object p1, p0, Lnb/i$g;->a:Leb/k0$j;

    return-void
.end method


# virtual methods
.method public final a(Leb/k0$g;)Leb/k0$f;
    .locals 4

    .line 1
    iget-object v0, p0, Lnb/i$g;->a:Leb/k0$j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Leb/k0$j;->a(Leb/k0$g;)Leb/k0$f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p1, Leb/k0$f;->a:Leb/k0$i;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lnb/i$g$a;

    .line 12
    .line 13
    invoke-virtual {v0}, Leb/k0$i;->c()Leb/a;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    sget-object v3, Lnb/i;->n:Leb/a$b;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Leb/a;->a(Leb/a$b;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lnb/i$a;

    .line 24
    .line 25
    iget-object p1, p1, Leb/k0$f;->b:Leb/h$a;

    .line 26
    .line 27
    invoke-direct {v1, v2, p1}, Lnb/i$g$a;-><init>(Lnb/i$a;Leb/h$a;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Leb/k0$f;->b(Leb/k0$i;Lnb/i$g$a;)Leb/k0$f;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_0
    return-object p1
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
