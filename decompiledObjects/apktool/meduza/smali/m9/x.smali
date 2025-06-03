.class public final synthetic Lm9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm9/y;

.field public final synthetic c:Leb/n0;


# direct methods
.method public synthetic constructor <init>(Lm9/y;Leb/n0;I)V
    .locals 0

    iput p3, p0, Lm9/x;->a:I

    iput-object p1, p0, Lm9/x;->b:Lm9/y;

    iput-object p2, p0, Lm9/x;->c:Leb/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lm9/x;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lm9/x;->b:Lm9/y;

    .line 8
    .line 9
    iget-object v1, p0, Lm9/x;->c:Leb/n0;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lm9/y;->b(Leb/n0;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :goto_0
    iget-object v0, p0, Lm9/x;->b:Lm9/y;

    .line 16
    .line 17
    iget-object v1, p0, Lm9/x;->c:Leb/n0;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Leb/n0;->H()Leb/n0;

    .line 23
    .line 24
    .line 25
    sget-object v1, Ln9/f;->c:Ln9/m;

    .line 26
    .line 27
    new-instance v2, Lm9/w;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v2, v0, v3}, Lm9/w;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, v0, Lm9/y;->a:Lcom/google/android/gms/tasks/Task;

    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
