.class public final Ln9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Lm/a;

.field public static final c:Ln9/m;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/tasks/TaskExecutors;->MAIN_THREAD:Ljava/util/concurrent/Executor;

    sput-object v0, Ln9/f;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lm/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lm/a;-><init>(I)V

    sput-object v0, Ln9/f;->b:Lm/a;

    new-instance v0, Ln9/m;

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1}, Ln9/m;-><init>(Ljava/util/concurrent/Executor;)V

    sput-object v0, Ln9/f;->c:Ln9/m;

    return-void
.end method
