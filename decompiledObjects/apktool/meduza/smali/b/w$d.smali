.class public final Lb/w$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final a:Lb/p;

.field public final synthetic b:Lb/w;


# direct methods
.method public constructor <init>(Lb/w;Lb/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/p;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lb/w$d;->b:Lb/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb/w$d;->a:Lb/p;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb/w$d;->b:Lb/w;

    .line 2
    .line 3
    iget-object v0, v0, Lb/w;->c:Lsb/i;

    .line 4
    .line 5
    iget-object v1, p0, Lb/w$d;->a:Lb/p;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lsb/i;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lb/w$d;->b:Lb/w;

    .line 11
    .line 12
    iget-object v0, v0, Lb/w;->d:Lb/p;

    .line 13
    .line 14
    iget-object v1, p0, Lb/w$d;->a:Lb/p;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lb/w$d;->a:Lb/p;

    .line 24
    .line 25
    invoke-virtual {v0}, Lb/p;->handleOnBackCancelled()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lb/w$d;->b:Lb/w;

    .line 29
    .line 30
    iput-object v1, v0, Lb/w;->d:Lb/p;

    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lb/w$d;->a:Lb/p;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Lb/p;->removeCancellable(Lb/c;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lb/w$d;->a:Lb/p;

    .line 38
    .line 39
    invoke-virtual {v0}, Lb/p;->getEnabledChangedCallback$activity_release()Ldc/a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ldc/a;->invoke()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object v0, p0, Lb/w$d;->a:Lb/p;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lb/p;->setEnabledChangedCallback$activity_release(Ldc/a;)V

    .line 51
    .line 52
    .line 53
    return-void
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
