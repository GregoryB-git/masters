.class public final synthetic Lm9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lm9/v;

.field public final synthetic b:[Leb/e;

.field public final synthetic c:Lm9/a0;


# direct methods
.method public synthetic constructor <init>(Lm9/v;Lm9/a$c;[Leb/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/p;->a:Lm9/v;

    iput-object p3, p0, Lm9/p;->b:[Leb/e;

    iput-object p2, p0, Lm9/p;->c:Lm9/a0;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lm9/p;->a:Lm9/v;

    .line 2
    .line 3
    iget-object v1, p0, Lm9/p;->b:[Leb/e;

    .line 4
    .line 5
    iget-object v2, p0, Lm9/p;->c:Lm9/a0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Leb/e;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object p1, v1, v3

    .line 18
    .line 19
    new-instance v4, Lm9/r;

    .line 20
    .line 21
    invoke-direct {v4, v0, v2, v1}, Lm9/r;-><init>(Lm9/v;Lm9/a0;[Leb/e;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lm9/v;->a()Leb/s0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1, v4, v0}, Leb/e;->e(Leb/e$a;Leb/s0;)V

    .line 29
    .line 30
    .line 31
    check-cast v2, Lm9/a$c;

    .line 32
    .line 33
    iget-object p1, v2, Lm9/a$c;->a:Lm9/a$a;

    .line 34
    .line 35
    new-instance v0, Lb/k;

    .line 36
    .line 37
    const/16 v4, 0x10

    .line 38
    .line 39
    invoke-direct {v0, v2, v4}, Lb/k;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lm9/a$a;->a(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    aget-object p1, v1, v3

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    invoke-virtual {p1, v0}, Leb/e;->c(I)V

    .line 49
    .line 50
    .line 51
    return-void
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
