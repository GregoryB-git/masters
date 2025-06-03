.class public final Lvc/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnc/k;
.implements Lnc/i2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvc/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnc/k<",
        "Lrb/h;",
        ">;",
        "Lnc/i2;"
    }
.end annotation


# instance fields
.field public final a:Lnc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnc/l<",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Lvc/d;


# direct methods
.method public constructor <init>(Lvc/d;Lnc/l;)V
    .locals 0

    iput-object p1, p0, Lvc/d$a;->c:Lvc/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lvc/d$a;->a:Lnc/l;

    const/4 p1, 0x0

    iput-object p1, p0, Lvc/d$a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ldc/l;)V
    .locals 2

    .line 1
    check-cast p1, Lrb/h;

    .line 2
    .line 3
    iget-object p2, p0, Lvc/d$a;->c:Lvc/d;

    .line 4
    .line 5
    sget-object v0, Lvc/d;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 6
    .line 7
    iget-object v1, p0, Lvc/d$a;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v0, p2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lvc/d$a;->a:Lnc/l;

    .line 13
    .line 14
    new-instance v0, Lvc/b;

    .line 15
    .line 16
    iget-object v1, p0, Lvc/d$a;->c:Lvc/d;

    .line 17
    .line 18
    invoke-direct {v0, v1, p0}, Lvc/b;-><init>(Lvc/d;Lvc/d$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1, v0}, Lnc/l;->b(Ljava/lang/Object;Ldc/l;)V

    .line 22
    .line 23
    .line 24
    return-void
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

.method public final c(Lsc/t;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsc/t<",
            "*>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lvc/d$a;->a:Lnc/l;

    invoke-virtual {v0, p1, p2}, Lnc/l;->c(Lsc/t;I)V

    return-void
.end method

.method public final cancel(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lvc/d$a;->a:Lnc/l;

    invoke-virtual {v0, p1}, Lnc/l;->cancel(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final e(Ljava/lang/Throwable;)Ld2/h0;
    .locals 1

    iget-object v0, p0, Lvc/d$a;->a:Lnc/l;

    invoke-virtual {v0, p1}, Lnc/l;->e(Ljava/lang/Throwable;)Ld2/h0;

    move-result-object p1

    return-object p1
.end method

.method public final getContext()Lub/h;
    .locals 1

    iget-object v0, p0, Lvc/d$a;->a:Lnc/l;

    iget-object v0, v0, Lnc/l;->e:Lub/h;

    return-object v0
.end method

.method public final h(Lnc/a0;Lrb/h;)V
    .locals 1

    iget-object v0, p0, Lvc/d$a;->a:Lnc/l;

    invoke-virtual {v0, p1, p2}, Lnc/l;->h(Lnc/a0;Lrb/h;)V

    return-void
.end method

.method public final j(Ljava/lang/Object;Ldc/l;)Ld2/h0;
    .locals 2

    .line 1
    check-cast p1, Lrb/h;

    .line 2
    .line 3
    iget-object p2, p0, Lvc/d$a;->c:Lvc/d;

    .line 4
    .line 5
    iget-object v0, p0, Lvc/d$a;->a:Lnc/l;

    .line 6
    .line 7
    new-instance v1, Lvc/c;

    .line 8
    .line 9
    invoke-direct {v1, p2, p0}, Lvc/c;-><init>(Lvc/d;Lvc/d$a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lnc/l;->D(Ljava/lang/Object;Ldc/l;)Ld2/h0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p2, p0, Lvc/d$a;->c:Lvc/d;

    .line 19
    .line 20
    sget-object v0, Lvc/d;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 21
    .line 22
    iget-object v1, p0, Lvc/d$a;->b:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0, p2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object p1
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

.method public final n(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lvc/d$a;->a:Lnc/l;

    invoke-virtual {v0, p1}, Lnc/l;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lvc/d$a;->a:Lnc/l;

    invoke-virtual {v0, p1}, Lnc/l;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
