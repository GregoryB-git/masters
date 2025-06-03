.class public final synthetic Ld9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/i;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Lcom/google/firebase/firestore/l$a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/util/concurrent/ThreadPoolExecutor;Lq3/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/t;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p2, p0, Ld9/t;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Ld9/t;->c:Lcom/google/firebase/firestore/l$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ld9/t;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v1, p0, Ld9/t;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Ld9/t;->c:Lcom/google/firebase/firestore/l$a;

    check-cast p1, Lg9/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ld9/v;

    invoke-direct {v3, v0, v2, p1}, Ld9/v;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/l$a;Lg9/m0;)V

    invoke-static {v1, v3}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
